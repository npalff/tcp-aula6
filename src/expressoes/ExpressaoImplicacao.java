package expressoes;

import java.util.Map;

public class ExpressaoImplicacao extends ExpressaoBinaria {

	public ExpressaoImplicacao(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		return "(" + super.getLHS() + " -> " + super.getRHS() + ")";
	}
	
	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return !super.getLHS().eval(valoresVariaveis) || super.getRHS().eval(valoresVariaveis);
	}
}
