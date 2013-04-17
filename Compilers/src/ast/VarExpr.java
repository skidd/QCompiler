package ast;

public class VarExpr extends Expr {

	private String var;

	public VarExpr(String var) {
		super();
		this.var = var;
	}

	public String getVar() {
		return var;
	}
	
	
}