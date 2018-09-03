package expressoes;

import java.util.Map;

public class ExpressaoXor extends ExpressaoBinaria {
	public ExpressaoXor(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		return "(" + super.getLHS() + " xor " + super.getRHS() + ")";
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return ((super.getLHS().eval(valoresVariaveis) || super.getRHS().eval(valoresVariaveis)) && !(super.getLHS().eval(valoresVariaveis) && super.getRHS().eval(valoresVariaveis))) ;
	}
}