package expressoes;

import java.util.Map;

public interface ExpressaoLogica {
	public boolean eval(Map<String, Boolean> valoresVariaveis);
}