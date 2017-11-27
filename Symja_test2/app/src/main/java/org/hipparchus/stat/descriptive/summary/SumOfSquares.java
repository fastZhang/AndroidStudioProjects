/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hipparchus.stat.descriptive.summary;

import org.hipparchus.exception.MathIllegalArgumentException;
import org.hipparchus.exception.NullArgumentException;
import org.hipparchus.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.hipparchus.stat.descriptive.AggregatableStatistic;
import org.hipparchus.util.MathArrays;
import org.hipparchus.util.MathUtils;

import java.io.Serializable;

/**
 * Returns the sum of the squares of the available values.
 * <p>
 * If there are no values in the dataset, then 0 is returned.
 * If any of the values are
 * <code>NaN</code>, then <code>NaN</code> is returned.
 * <p>
 * <strong>Note that this implementation is not synchronized.</strong> If
 * multiple threads access an instance of this class concurrently, and at least
 * one of the threads invokes the <code>increment()</code> or
 * <code>clear()</code> method, it must be synchronized externally.
 */
public class SumOfSquares extends AbstractStorelessUnivariateStatistic
        implements AggregatableStatistic<SumOfSquares>, Serializable {

    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 20150412L;

    /**
     * Number of values that have been added
     */
    private long n;

    /**
     * The currently running sumSq
     */
    private double value;

    /**
     * Create a SumOfSquares instance.
     */
    public SumOfSquares() {
        n = 0;
        value = 0;
    }

    /**
     * Copy constructor, creates a new {@code SumOfSquares} identical
     * to the {@code original}.
     *
     * @param original the {@code SumOfSquares} instance to copy
     * @throws NullArgumentException if original is null
     */
    public SumOfSquares(SumOfSquares original) throws NullArgumentException {
        MathUtils.checkNotNull(original);
        this.n = original.n;
        this.value = original.value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void increment(final double d) {
        value += d * d;
        n++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResult() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getN() {
        return n;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        value = 0;
        n = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aggregate(SumOfSquares other) {
        MathUtils.checkNotNull(other);
        if (other.n > 0) {
            this.n += other.n;
            this.value += other.value;
        }
    }

    /**
     * Returns the sum of the squares of the entries in the specified portion of
     * the input array, or <code>Double.NaN</code> if the designated subarray
     * is empty.
     *
     * @param values the input array
     * @param begin  index of the first array element to include
     * @param length the number of elements to include
     * @return the sum of the squares of the values or 0 if length = 0
     * @throws MathIllegalArgumentException if the array is null or the array index
     *                                      parameters are not valid
     */
    @Override
    public double evaluate(final double[] values, final int begin, final int length)
            throws MathIllegalArgumentException {

        double sumSq = Double.NaN;
        if (MathArrays.verifyValues(values, begin, length, true)) {
            sumSq = 0.0;
            for (int i = begin; i < begin + length; i++) {
                sumSq += values[i] * values[i];
            }
        }
        return sumSq;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SumOfSquares copy() {
        return new SumOfSquares(this);
    }

}