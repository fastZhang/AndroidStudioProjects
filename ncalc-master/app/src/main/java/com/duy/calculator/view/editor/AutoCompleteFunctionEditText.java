/*
 * Copyright 2017 Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.calculator.view.editor;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.AttributeSet;

import com.duy.calculator.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;

/**
 * Created by Duy on 19/7/2016
 */
public class AutoCompleteFunctionEditText extends android.support.v7.widget.AppCompatMultiAutoCompleteTextView {

    private final Handler mHandler = new Handler();
    private HighlightWatcher mHighlightWatcher = new HighlightWatcher();
    private boolean isEnableTextListener;
    private final Runnable mUpdateHighlight = new Runnable() {
        @Override
        public void run() {
            highlight(getEditableText());
        }
    };
    private SuggestAdapter mAdapter;

    public AutoCompleteFunctionEditText(Context context) {
        super(context);
        init();
    }

    public AutoCompleteFunctionEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AutoCompleteFunctionEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setAutoSuggestEnable(boolean enable) {
        if (!enable) {
            setAdapter(null);
        } else {
            init();
        }
    }

    private void init() {
        if (!isInEditMode()) {
            String[] keyWords = Patterns.KEY_WORDS;
            ArrayList<String> data = new ArrayList<>();
            Collections.addAll(data, keyWords);
            mAdapter = new SuggestAdapter(getContext(), R.layout.list_item_suggest, data);
            setAdapter(mAdapter);
            setTokenizer(new FunctionTokenizer());
            setThreshold(1);
            enableTextChangeListener();
        }
    }

    public void setOnHelpListener(SuggestAdapter.OnSuggestionListener onHelpListener) {
        mAdapter.setOnSuggestionListener(onHelpListener);
    }

    private void enableTextChangeListener() {
        if (!isEnableTextListener) {
            addTextChangedListener(mHighlightWatcher);
            isEnableTextListener = true;
        }
    }

    private void disableTextChangeListener() {
        this.isEnableTextListener = false;
        removeTextChangedListener(mHighlightWatcher);
    }

    public void highlight(Editable editable) {
        disableTextChangeListener();
        StyleSpan[] spans = editable.getSpans(0, editable.length(), StyleSpan.class);
        for (StyleSpan span : spans) {
            editable.removeSpan(span);
        }

        String s = editable.toString();
        Matcher matcher = Patterns.FUNCTION_PATTERN.matcher(s);
        while (matcher.find()) {
            StyleSpan styleSpan = new StyleSpan(Typeface.BOLD);
            editable.setSpan(styleSpan, matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        enableTextChangeListener();
    }

    public class FunctionTokenizer implements Tokenizer {
        String token = "!@#$%^&*()_+-={}|[]:'<>/<.?1234567890";

        @Override
        public int findTokenStart(CharSequence text, int cursor) {
            int i = cursor;
            while (i > 0 && !token.contains(Character.toString(text.charAt(i - 1)))) {
                i--;
            }
            while (i < cursor && text.charAt(i) == ' ') {
                i++;
            }
            return i;
        }

        @Override
        public int findTokenEnd(CharSequence text, int cursor) {
            int i = cursor;
            int len = text.length();

            while (i < len) {
                if (token.contains(Character.toString(text.charAt(i - 1)))) {
                    return i;
                } else {
                    i++;
                }
            }

            return len;
        }

        @Override
        public CharSequence terminateToken(CharSequence text) {
            int i = text.length();

            while (i > 0 && text.charAt(i - 1) == ' ') {
                i--;
            }

            if (i > 0 && token.contains(Character.toString(text.charAt(i - 1)))) {
                return text;
            } else {
                if (text instanceof Spanned) {
                    SpannableString sp = new SpannableString(text);
                    TextUtils.copySpansFrom((Spanned) text, 0, text.length(),
                            Object.class, sp, 0);
                    return sp;
                } else {
                    return text;
                }
            }
        }
    }

    class HighlightWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            mHandler.removeCallbacks(mUpdateHighlight);
            mHandler.postDelayed(mUpdateHighlight, 1000);
        }
    }
}
