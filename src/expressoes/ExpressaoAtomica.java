package expressoes;

import java.util.Map;

public class ExpressaoAtomica implements ExpressaoLogica {
	private String var;

	public ExpressaoAtomica(String var) {
		super();
		this.var = var;
	}

	public String getVar() {
		return this.var;
	}
	
	@Override
	public String toString() {
		return this.var;
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return valoresVariaveis.get(this.var);
	}
}