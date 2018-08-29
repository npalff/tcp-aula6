package expressoes;

import java.util.Map;

public class ExpressaoOr extends ExpressaoBinaria {
	public ExpressaoOr(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		return "(" + super.getLHS() + " or " + super.getRHS() + ")";
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return super.getLHS().eval(valoresVariaveis) || super.getRHS().eval(valoresVariaveis);
	}
}