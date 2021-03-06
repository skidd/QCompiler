package ast;

import java.util.ArrayList;

import visitor.Visitor;

public class MainDecl {
	
	private ArrayList<Stmt> stmts = new ArrayList<Stmt>();

	public MainDecl(ArrayList<Stmt> s) {
		stmts = s;
	}

	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < stmts.size(); i++){
			s = s + stmts.get(i).toString();
		}
		return s;
		//return stmts.toString();
	}

	public ArrayList<Stmt> getStmts() {
		return stmts;
	}
	
    public Object accept(Visitor v){
		return v.visit(this);
	}
}
