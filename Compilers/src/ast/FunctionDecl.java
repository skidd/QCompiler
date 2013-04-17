package ast;

import java.util.ArrayList;

public class FunctionDecl extends Decl {
	
	private String id;
	private String returnType;
	private ArrayList<Field> fieldDecl;
	private ArrayList<Stmt> body;
	
	public FunctionDecl(String id, String returnType,
			ArrayList<Field> fieldDecl, ArrayList<Stmt> body) {
		this.id = id;
		this.returnType = returnType;
		this.fieldDecl = fieldDecl;
		this.body = body;
	}
	public String getId() {
		return id;
	}
	public String getReturnType() {
		return returnType;
	}
	public ArrayList<Field> getFieldDecl() {
		return fieldDecl;
	}
	public ArrayList<Stmt> getBody() {
		return body;
	}
	@Override
	public String toString() {
		return "FunctionDecl [" + (id != null ? "id=" + id + ", " : "")
				+ (returnType != null ? "returnType=" + returnType + ", " : "")
				+ (fieldDecl != null ? "fieldDecl=" + fieldDecl + ", " : "")
				+ (body != null ? "body=" + body : "") + "]";
	}

}