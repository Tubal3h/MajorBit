//Creare una classe chiamata Canzone le cui variabili d’istanza sono:
//- Titolo (String)
//- Durata in minuti (Numerico)   
//- Cantante (String) 
//e i metodi get , set e costruttore.

//Creare nella classe Utile, un metodo chiamato mediaCanzoni che prenderà in ingresso un array di   canzoni.
//-  Quindi creare un’ applicazione che istanzi 5 Canzoni e che permetta la visualizzazione della durata media delle 5 canzoni.
class Canzone {
	private String titolo;
	private double durata;
	private String cantante;
	
	public Canzone(String titolo, double durata, String cantante){
		this.titolo = titolo;
		this.durata = durata;
		this.cantante = cantante;
	}
	
	public String getTitolo (){
		return titolo;
	}
	
	public void setTitolo (String titolo){
		this.titolo = titolo;
	}
	
	public double getDurata (){
		return durata;
	}
	
	public void setDurata (double durata){
		this.durata = durata;
	}
	
	public String getCantante (){
		return cantante;
	}
	
	public void setCantante (String cantante){
		this.cantante = titolo;
	}
	
}