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
public class IntRules77 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(e,Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,Negate(C1))),Power(Times(b,d,Plus(m,Negate(C1))),-1)),Times(CN1,Sqr(e),Power(a,-1),Int(Times(Sqr(Cos(Plus(c,Times(d,x)))),Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Sqr(a),Negate(Sqr(b))))),NonzeroQ(Plus(m,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,e,Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,Negate(C1))),Power(Times(b,d,Plus(m,Negate(C1))),-1)),Times(CN1,Sqr(e),Power(a,-1),Int(Times(Sqr(Sin(Plus(c,Times(d,x)))),Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Sqr(a),Negate(Sqr(b))))),NonzeroQ(Plus(m,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(x,Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(b,Times(a,x)),-1)),x),x,Cos(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,-1),Subst(Int(Times(x,Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(b,Times(a,x)),-1)),x),x,Sin(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(b,e,Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,Negate(C1))),Power(Times(d,Sqr(a),Plus(m,Negate(C1))),-1)),Times(CN1,Sqr(e),Power(a,-1),Int(Times(Sqr(Cos(Plus(c,Times(d,x)))),Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,Negate(C2)))),x)),Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b))),Power(a,-2),Int(Times(Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,e,Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,Negate(C1))),Power(Times(d,Sqr(a),Plus(m,Negate(C1))),-1)),Times(CN1,Sqr(e),Power(a,-1),Int(Times(Sqr(Sin(Plus(c,Times(d,x)))),Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,Negate(C2)))),x)),Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b))),Power(a,-2),Int(Times(Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,C1)),Power(Times(d,e,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Sqr(Cos(Plus(c,Times(d,x)))),Power(Times(e,Sin(Plus(c,Times(d,x)))),m)),x)),Times(Sqr(a),Power(Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Times(e,Sin(Plus(c,Times(d,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Times(e_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(b,Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,C1)),Power(Times(d,e,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Sqr(Sin(Plus(c,Times(d,x)))),Power(Times(e,Cos(Plus(c,Times(d,x)))),m)),x)),Times(Sqr(a),Power(Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Times(e,Cos(Plus(c,Times(d,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sqr($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(Plus(C1,Negate(Sqr(Cos(Plus(c,Times(d,x)))))),Power(Plus(b,Times(a,Cos(Plus(c,Times(d,x))))),n),Power(Power(Cos(Plus(c,Times(d,x))),n),-1)),x),And(FreeQ(List(a,b,c,d),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sqr($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(Plus(C1,Negate(Sqr(Sin(Plus(c,Times(d,x)))))),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),n),Power(Power(Sin(Plus(c,Times(d,x))),n),-1)),x),And(FreeQ(List(a,b,c,d),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Negate(Sqr(Cos(Plus(c,Times(d,x)))))),Times(C1D2,m)),Power(Plus(b,Times(a,Cos(Plus(c,Times(d,x))))),n),Power(Power(Cos(Plus(c,Times(d,x))),n),-1)),x),x),And(And(FreeQ(List(a,b,c,d),x),IntegerQ(n)),EvenQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Power($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Negate(Sqr(Sin(Plus(c,Times(d,x)))))),Times(C1D2,m)),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),n),Power(Power(Sin(Plus(c,Times(d,x))),n),-1)),x),x),And(And(FreeQ(List(a,b,c,d),x),IntegerQ(n)),EvenQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(a,-1),Int(Power(Tan(Plus(c,Times(d,x))),Plus(m,Negate(C2))),x)),Times(Power(b,-1),Int(Times(Sec(Plus(c,Times(d,x))),Power(Tan(Plus(c,Times(d,x))),Plus(m,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d,m),x),ZeroQ(Plus(Sqr(a),Negate(Sqr(b))))),NonzeroQ(Plus(m,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(a,-1),Int(Power(Cot(Plus(c,Times(d,x))),Plus(m,Negate(C2))),x)),Times(Power(b,-1),Int(Times(Csc(Plus(c,Times(d,x))),Power(Cot(Plus(c,Times(d,x))),Plus(m,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d,m),x),ZeroQ(Plus(Sqr(a),Negate(Sqr(b))))),NonzeroQ(Plus(m,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Times(Power(x,Plus(m,Negate(C1))),Plus(b,Times(a,x))),-1)),x),x,Cos(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,-1),Subst(Int(Times(Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Times(Power(x,Plus(m,Negate(C1))),Plus(b,Times(a,x))),-1)),x),x,Sin(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),OddQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Power(b,-2),Int(Power(Tan(Plus(c,Times(d,x))),Plus(m,Negate(C2))),x)),Times(Power(b,-1),Int(Times(Sec(Plus(c,Times(d,x))),Power(Tan(Plus(c,Times(d,x))),Plus(m,Negate(C2)))),x)),Times(Plus(Sqr(a),Negate(Sqr(b))),Power(b,-2),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Power(b,-2),Int(Power(Cot(Plus(c,Times(d,x))),Plus(m,Negate(C2))),x)),Times(Power(b,-1),Int(Times(Csc(Plus(c,Times(d,x))),Power(Cot(Plus(c,Times(d,x))),Plus(m,Negate(C2)))),x)),Times(Plus(Sqr(a),Negate(Sqr(b))),Power(b,-2),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Power(Tan(Plus(c,Times(d,x))),m),x)),Times(CN1,b,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Sec(Plus(c,Times(d,x))),Power(Tan(Plus(c,Times(d,x))),m)),x)),Times(Sqr(b),Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C2)),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Power(Cot(Plus(c,Times(d,x))),m),x)),Times(CN1,b,Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Csc(Plus(c,Times(d,x))),Power(Cot(Plus(c,Times(d,x))),m)),x)),Times(Sqr(b),Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C2)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),Not(OddQ(m))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sqr($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(Plus(C1,Negate(Sqr(Cos(Plus(c,Times(d,x)))))),Power(Plus(b,Times(a,Cos(Plus(c,Times(d,x))))),n),Power(Power(Cos(Plus(c,Times(d,x))),n),-1)),x),And(FreeQ(List(a,b,c,d),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sqr($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(Plus(C1,Negate(Sqr(Sin(Plus(c,Times(d,x)))))),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),n),Power(Power(Sin(Plus(c,Times(d,x))),n),-1)),x),And(FreeQ(List(a,b,c,d),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Negate(Sqr(Cos(Plus(c,Times(d,x)))))),Times(C1D2,m)),Power(Plus(b,Times(a,Cos(Plus(c,Times(d,x))))),n),Power(Power(Cos(Plus(c,Times(d,x))),Plus(m,n)),-1)),x),x),And(And(FreeQ(List(a,b,c,d),x),IntegerQ(n)),EvenQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(C1,Negate(Sqr(Sin(Plus(c,Times(d,x)))))),Times(C1D2,m)),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),n),Power(Power(Sin(Plus(c,Times(d,x))),Plus(m,n)),-1)),x),x),And(And(FreeQ(List(a,b,c,d),x),IntegerQ(n)),EvenQ(m))))
  );
}
