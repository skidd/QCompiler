package ast;

import visitor.Visitor;

public class EqBinaryExpr extends BinaryExpr {

	public EqBinaryExpr(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	public Object accept(Visitor v){
		return v.visit(this);
	}


}
