package ast;


public class TimesBinaryExpr extends BinaryExpr {

	public TimesBinaryExpr(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		
		return super.lhs + " * " + super.rhs + ";";
	}
	
}
