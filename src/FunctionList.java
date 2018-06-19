import java.util.ArrayList;

public class FunctionList
{
	private ArrayList<Funtions> functions;

	public FunctionList() {
		functions = new ArrayList<Functions>();
	}

	public void addFunction(Function function) {
		functions.add(function);
	}

	public void removeFunction(Function function) {
		functions.remove(function);
	}

	public ArrayList<Functions> getAllFunction() {
		return(functions);
	}

	public Asset getFunctionByIndex(int f) {
		return(functions.get(f));
	}

	public int getFunctionCount() {
		return(functions.size());
	}

	public ArrayList<Functions> search(String s) {
		Function f = null;
		ArrayList<Functions> func = new ArrayList<Functions>();
		String str = s.toLowerCase();
		for(int i=0; i<getFunctionCount(); i++) {
			f = getFunctionByIndex(i);
			if(matches(f, str)) {
				func.add(f);
			}
		}
		return(func);
	}
}
