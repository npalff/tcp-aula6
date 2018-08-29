package expressoes;

import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria {
	public ExpressaoNot(ExpressaoLogica expr) {
		super(expr);
	}
	
	@Override
	public String toString() {
		return "(not " + super.getExpressao() + ")";
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return !super.getExpressao().eval(valoresVariaveis);
	}
	
}