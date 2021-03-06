package gov.adlnet.xapi.model;

import java.util.ArrayList;

public class StatementResult {
	public ArrayList<Statement> getStatements() {
		return statements;
	}
	public void setStatements(ArrayList<Statement> statements) {
		this.statements = statements;
	}
	public String getMore() {
		return more;
	}
	public void setMore(String more) {
		this.more = more;
	}
	public boolean hasMore() {
		return this.more != null && this.more.length() > 0;
	}
	private ArrayList<Statement> statements;
	private String more;
	
}
