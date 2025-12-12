public class ErrorCatch extends Exception{
	private Integer n;
	public ErrorCatch(Integer n){
		this.n = n;
	}
	
	@Override
	public String toString(){
		return "Il numero inserito e negativo: "+n;
	}
	
}
