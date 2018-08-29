package expressoes;

public abstract class ExpressaoUnaria implements ExpressaoLogica {
	private ExpressaoLogica expr;
	
	public ExpressaoUnaria(ExpressaoLogica expr) {
		this.expr = expr;
	}
	
	public ExpressaoLogica getExpressao() {
		return this.expr;
	}	
}