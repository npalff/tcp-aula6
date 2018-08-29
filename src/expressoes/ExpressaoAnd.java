package expressoes;

import java.util.Map;

public class ExpressaoAnd extends ExpressaoBinaria {
	public ExpressaoAnd(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		return "(" + super.getLHS() + " and " + super.getRHS() + ")";
	}
	
	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return super.getLHS().eval(valoresVariaveis) && super.getRHS().eval(valoresVariaveis);
	}
}