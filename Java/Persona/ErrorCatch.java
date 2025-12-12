public class ErrorCatch extends Exception{

	@Override
	public String toString(){
		return "Inserisci un voto tra 0 e 10.";
	}
	
}
