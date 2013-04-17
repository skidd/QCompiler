package ast;

public class BinaryExpr extends Expr {
	
	private Expr lhs;
	private Expr rhs;
	
	public BinaryExpr(Expr lhs, Expr rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Expr getLhs() {
		return lhs;
	}

	public Expr getRhs() {
		return rhs;
	}

}