package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules87 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Cos")),SameQ(FSymbol,$s("§cos")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Sin")),SameQ(FSymbol,$s("§sin")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Cot")),SameQ(FSymbol,$s("§cot")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Tan")),SameQ(FSymbol,$s("§tan")))))),
ISetDelayed(Int(Times(u_,Sqr($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(And(FreeQ(List(a,b,c),x),NonsumQ(u)),Or(SameQ(FSymbol,$s("Sec")),SameQ(FSymbol,$s("§sec")))))),
ISetDelayed(Int(Times(u_,Power($($s("§cos"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),-2)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
ISetDelayed(Int(Times(u_,Sqr($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(And(FreeQ(List(a,b,c),x),NonsumQ(u)),Or(SameQ(FSymbol,$s("Csc")),SameQ(FSymbol,$s("§csc")))))),
ISetDelayed(Int(Times(u_,Power($($s("§sin"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),-2)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Power(Times(Power(x,n),Plus(C1,Times(Sqr(d),Sqr(x)))),-1),Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),And(FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Cot(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(And(FreeQ(List(a,b,c),x),IntegerQ(n)),Or(SameQ(FSymbol,$s("Cot")),SameQ(FSymbol,$s("§cot")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Power(Times(Power(x,n),Plus(C1,Times(Sqr(d),Sqr(x)))),-1),Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),And(FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Tan(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(And(FreeQ(List(a,b,c),x),IntegerQ(n)),Or(SameQ(FSymbol,$s("Tan")),SameQ(FSymbol,$s("§tan")))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,FunctionOfTrig(u,x))),Condition(Module(List(Set(d,FreeFactors(Cot(v),x))),Dist(Times(CN1,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Cot(v),Power(d,-1)),u,x),x),x,Times(Cot(v),Power(d,-1))),x)),And(And(NotFalseQ(v),FunctionOfQ(NonfreeFactors(Cot(v),x),u,x,True)),TryPureTanSubst(ActivateTrig(u),x))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,FunctionOfTrig(u,x))),Condition(Module(List(Set(d,FreeFactors(Tan(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(v),Power(d,-1)),u,x),x),x,Times(Tan(v),Power(d,-1))),x)),And(And(NotFalseQ(v),FunctionOfQ(NonfreeFactors(Tan(v),x),u,x,True)),TryPureTanSubst(ActivateTrig(u),x))))),
ISetDelayed(Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q))),x),x),And(And(And(FreeQ(List(a,b,c,d),x),Or(SameQ(FSymbol,$s("§sin")),SameQ(FSymbol,$s("§cos")))),Or(SameQ(GSymbol,$s("§sin")),SameQ(GSymbol,$s("§cos")))),PositiveIntegerQ(p,q)))),
ISetDelayed(Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power($($p("H"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q),Power(H(Plus(e,Times(f,x))),r))),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e,f),x),Or(SameQ(FSymbol,$s("§sin")),SameQ(FSymbol,$s("§cos")))),Or(SameQ(GSymbol,$s("§sin")),SameQ(GSymbol,$s("§cos")))),Or(SameQ($s("H"),$s("§sin")),SameQ($s("H"),$s("§cos")))),PositiveIntegerQ(p,q,r)))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Cos")),SameQ(FSymbol,$s("§cos")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(C1,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Sin")),SameQ(FSymbol,$s("§sin")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Cot")),SameQ(FSymbol,$s("§cot")))))),
ISetDelayed(Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(SameQ(FSymbol,$s("Tan")),SameQ(FSymbol,$s("§tan")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Cos")),SameQ(FSymbol,$s("§cos")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(d,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Sec")),SameQ(FSymbol,$s("§sec")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Sin")),SameQ(FSymbol,$s("§sin")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,d,Power(Times(b,c),-1),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Csc")),SameQ(FSymbol,$s("§csc")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Cot")),SameQ(FSymbol,$s("§cot")))))),
ISetDelayed(Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Module(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Times(CN1,Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(And(And(FreeQ(List(a,b,c),x),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Tan")),SameQ(FSymbol,$s("§tan")))))),
ISetDelayed(Int(Times(u_,Plus(v_,Times(d_DEFAULT,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(Module(List(Set(e,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Plus(Int(ActivateTrig(Times(u,v)),x),Times(d,Int(Times(ActivateTrig(u),Power(Cos(Times(c,Plus(a,Times(b,x)))),n)),x))),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(e,-1)),u,x))),And(And(And(And(FreeQ(List(a,b,c,d),x),Not(FreeQ(v,x))),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Cos")),SameQ(FSymbol,$s("§cos")))))),
ISetDelayed(Int(Times(u_,Plus(v_,Times(d_DEFAULT,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(Module(List(Set(e,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Plus(Int(ActivateTrig(Times(u,v)),x),Times(d,Int(Times(ActivateTrig(u),Power(Sin(Times(c,Plus(a,Times(b,x)))),n)),x))),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(e,-1)),u,x))),And(And(And(And(FreeQ(List(a,b,c,d),x),Not(FreeQ(v,x))),OddQ(n)),NonsumQ(u)),Or(SameQ(FSymbol,$s("Sin")),SameQ(FSymbol,$s("§sin")))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,FunctionOfTrig(u,x))),Condition(Module(List(Set(d,FreeFactors(Sin(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(C1,Times(Sin(v),Power(d,-1)),Times(u,Power(Cos(v),-1)),x),x),x,Times(Sin(v),Power(d,-1))),x)),And(NotFalseQ(v),FunctionOfQ(NonfreeFactors(Sin(v),x),Times(u,Power(Cos(v),-1)),x))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,FunctionOfTrig(u,x))),Condition(Module(List(Set(d,FreeFactors(Cos(v),x))),Dist(Times(CN1,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(C1,Times(Cos(v),Power(d,-1)),Times(u,Power(Sin(v),-1)),x),x),x,Times(Cos(v),Power(d,-1))),x)),And(NotFalseQ(v),FunctionOfQ(NonfreeFactors(Cos(v),x),Times(u,Power(Sin(v),-1)),x))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(a,c),p),Int(ActivateTrig(u),x)),And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(b,Negate(c)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(b_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(a,c),p),Int(ActivateTrig(u),x)),And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(b,c))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(c_DEFAULT,Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(a,c),p),Int(ActivateTrig(u),x)),And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(b,c))))),
ISetDelayed(Int(Times(u_,Power(y_,-1)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(ActivateTrig(y),ActivateTrig(u),x))),Condition(Times(q,Log(RemoveContent(ActivateTrig(y),x))),Not(FalseQ(q)))),Not(InertTrigFreeQ(u)))),
ISetDelayed(Int(Times(u_,Power(Times(w_,y_),-1)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(ActivateTrig(Times(y,w)),ActivateTrig(u),x))),Condition(Times(q,Log(RemoveContent(ActivateTrig(Times(y,w)),x))),Not(FalseQ(q)))),Not(InertTrigFreeQ(u)))),
ISetDelayed(Int(Times(u_,Power(y_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(ActivateTrig(y),ActivateTrig(u),x))),Condition(Times(q,ActivateTrig(Power(y,Plus(m,C1))),Power(Plus(m,C1),-1)),Not(FalseQ(q)))),And(And(FreeQ(m,x),NonzeroQ(Plus(m,C1))),Not(InertTrigFreeQ(u))))),
ISetDelayed(Int(Times(u_,Power(y_,m_DEFAULT),Power(z_,n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(ActivateTrig(Times(y,z)),ActivateTrig(Times(u,Power(z,Plus(n,Negate(m))))),x))),Condition(Times(q,ActivateTrig(Times(Power(y,Plus(m,C1)),Power(z,Plus(m,C1)))),Power(Plus(m,C1),-1)),Not(FalseQ(q)))),And(And(FreeQ(List(m,n),x),NonzeroQ(Plus(m,C1))),Not(InertTrigFreeQ(u))))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Module(List(Set(v,FunctionOfTrig(u,x))),Condition(Module(List(Set(d,FreeFactors(Tan(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(v),Power(d,-1)),u,x),x),x,Times(Tan(v),Power(d,-1))),x)),And(NotFalseQ(v),FunctionOfQ(NonfreeFactors(Tan(v),x),u,x)))),InverseFunctionFreeQ(u,x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT))),p_)),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Sec(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(b,Times(a,Power(Sin(Plus(c,Times(d,x))),n))),p)),x),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),Times(b_DEFAULT,Power($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT))),p_)),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Csc(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(b,Times(a,Power(Cos(Plus(c,Times(d,x))),n))),p)),x),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p)))),
ISetDelayed(Int(Times(u_,Power(Plus(Times(a_,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),Times(b_DEFAULT,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(a,Times(b,Power(F(Plus(c,Times(d,x))),Plus(q,Negate(p))))),n))),x),And(And(And(FreeQ(List(a,b,c,d,p,q),x),InertTrigQ(FSymbol)),IntegerQ(n)),PosQ(Plus(q,Negate(p)))))),
ISetDelayed(Int(Times(u_,Power(Plus(Times(a_,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_DEFAULT)),Times(b_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_DEFAULT)),Times(c_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),r_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(d,Times(e,x))),Times(n,p)),Power(Plus(a,Times(b,Power(F(Plus(d,Times(e,x))),Plus(q,Negate(p)))),Times(c,Power(F(Plus(d,Times(e,x))),Plus(r,Negate(p))))),n))),x),And(And(And(And(FreeQ(List(a,b,c,d,e,p,q,r),x),InertTrigQ(FSymbol)),IntegerQ(n)),PosQ(Plus(q,Negate(p)))),PosQ(Plus(r,Negate(p)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_DEFAULT)),Times(c_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(d,Times(e,x))),Times(n,p)),Power(Plus(b,Times(a,Power(F(Plus(d,Times(e,x))),Negate(p))),Times(c,Power(F(Plus(d,Times(e,x))),Plus(q,Negate(p))))),n))),x),And(And(And(FreeQ(List(a,b,c,d,e,p,q),x),InertTrigQ(FSymbol)),IntegerQ(n)),NegQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Times(a,Power(E,Times(CN1,a,Power(b,-1),Plus(c,Times(d,x))))),n)),x),And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Int(TrigSimplify(u),x),TrigSimplifyQ(u))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Power(a,Plus(p,Negate(C1D2))),Sqrt(Times(a,$s("vv"))),Power($s("vv"),CN1D2),Int(Times($s("uu"),Power($s("vv"),p)),x))),And(And(FreeQ(a,x),PositiveIntegerQ(Plus(p,C1D2))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Power(a,Plus(p,C1D2)),Sqrt($s("vv")),Power(Times(a,$s("vv")),CN1D2),Int(Times($s("uu"),Power($s("vv"),p)),x))),And(And(FreeQ(a,x),NegativeIntegerQ(Plus(p,Negate(C1D2)))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Power(Times(a,$s("vv")),p),Power(Power($s("vv"),p),-1),Int(Times($s("uu"),Power($s("vv"),p)),x))),And(And(FreeQ(List(a,p),x),Not(IntegerQ(Times(C2,p)))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Sqrt(Power($s("vv"),m)),Power(Power($s("vv"),Times(C1D2,m)),-1),Int(Times($s("uu"),Power($s("vv"),Times(m,p))),x))),And(And(FreeQ(m,x),PositiveIntegerQ(Plus(p,C1D2))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Power($s("vv"),Times(C1D2,m)),Power(Power($s("vv"),m),CN1D2),Int(Times($s("uu"),Power($s("vv"),Times(m,p))),x))),And(And(FreeQ(m,x),NegativeIntegerQ(Plus(p,Negate(C1D2)))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Times(Power(Power($s("vv"),m),p),Power(Power($s("vv"),Times(m,p)),-1),Int(Times($s("uu"),Power($s("vv"),Times(m,p))),x))),And(And(FreeQ(List(m,p),x),Not(IntegerQ(Times(C2,p)))),Not(InertTrigFreeQ(v))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v)),Set($s("ww"),ActivateTrig(w))),Times(Sqrt(Times(Power($s("vv"),m),Power($s("ww"),n))),Power(Times(Power($s("vv"),Times(C1D2,m)),Power($s("ww"),Times(C1D2,n))),-1),Int(Times($s("uu"),Power($s("vv"),Times(m,p)),Power($s("ww"),Times(n,p))),x))),And(And(FreeQ(List(m,n),x),PositiveIntegerQ(Plus(p,C1D2))),Or(Not(InertTrigFreeQ(v)),Not(InertTrigFreeQ(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v)),Set($s("ww"),ActivateTrig(w))),Times(Power($s("vv"),Times(C1D2,m)),Power($s("ww"),Times(C1D2,n)),Power(Times(Power($s("vv"),m),Power($s("ww"),n)),CN1D2),Int(Times($s("uu"),Power($s("vv"),Times(m,p)),Power($s("ww"),Times(n,p))),x))),And(And(FreeQ(List(m,n),x),NegativeIntegerQ(Plus(p,Negate(C1D2)))),Or(Not(InertTrigFreeQ(v)),Not(InertTrigFreeQ(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Module(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v)),Set($s("ww"),ActivateTrig(w))),Times(Power(Times(Power($s("vv"),m),Power($s("ww"),n)),p),Power(Times(Power($s("vv"),Times(m,p)),Power($s("ww"),Times(n,p))),-1),Int(Times($s("uu"),Power($s("vv"),Times(m,p)),Power($s("ww"),Times(n,p))),x))),And(And(FreeQ(List(m,n,p),x),Not(IntegerQ(Times(C2,p)))),Or(Not(InertTrigFreeQ(v)),Not(InertTrigFreeQ(w)))))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Module(List(Set(v,ExpandTrig(u,x))),Condition(Int(v,x),SumQ(v))),Not(InertTrigFreeQ(u)))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Module(List(Set(w,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(SubstFor(Power(Plus(C1,Times(Sqr(FreeFactors(Tan(Times(C1D2,FunctionOfTrig(u,x))),x)),Sqr(x))),-1),Times(Tan(Times(C1D2,FunctionOfTrig(u,x))),Power(FreeFactors(Tan(Times(C1D2,FunctionOfTrig(u,x))),x),-1)),u,x),x)))),Condition(Module(List(Set(v,FunctionOfTrig(u,x)),d),CompoundExpression(Set(d,FreeFactors(Tan(Times(C1D2,v)),x)),Dist(Times(C2,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(Times(C1D2,v)),Power(d,-1)),u,x),x),x,Times(Tan(Times(C1D2,v)),Power(d,-1))),x))),FreeQ(w,$s("Int")))),And(InverseFunctionFreeQ(u,x),NotFalseQ(FunctionOfTrig(u,x))))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Module(List(Set(v,ActivateTrig(u))),Integrate(v,x)),Not(InertTrigFreeQ(u))))
  );
}
