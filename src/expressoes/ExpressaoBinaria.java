package expressoes;

public abstract class ExpressaoBinaria implements ExpressaoLogica {
	private ExpressaoLogica expr1;
	private ExpressaoLogica expr2;
	
	public ExpressaoBinaria(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		this.expr1 = lhs;
		this.expr2 = rhs;
	}
	
	public ExpressaoLogica getLHS() {
		return this.expr1;
	}
	
	public ExpressaoLogica getRHS() {
		return this.expr2;
	}
}