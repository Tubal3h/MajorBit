//Utilizzando la classe Canzone, scrivere una classe CdMusicale che abbia come              variabili d’istanza:
//Titolo della raccolta (String)
//un elenco(array) di Canzoni il cui numero deve essere impostato dal costruttore 
//della classe. 

class CdMusicale {

	private String titoloRaccolta;
	private Canzone[] arrCanzone;
	//private 
	
	public CdMusicale(String titoloRaccolta, int length){
		this.titoloRaccolta = titoloRaccolta;
		arrCanzone = new Canzone[length];
	}
	
	public void setTitolo(String titoloRaccolta){
		this.titoloRaccolta = titoloRaccolta;
	}
	
	public String getTitolo(){
		return titoloRaccolta;
	}
	
	public void setCanzone(Canzone canzone){
		for(int i=0; i<arrCanzone.length; i++){
			if(arrCanzone[i] == null ){
				arrCanzone[i] = canzone;
				break;
			}
		}
	}
	
	
	
	//public String[] 
}