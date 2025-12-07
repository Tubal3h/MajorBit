package esercizi;
//Inizializzare 2 stringhe, quindi: Visualizzare ‘OK’ se le due stringhe sono uguali. 
//Visualizzare la lunghezza di entrambe. 
//Caricare la seconda stringa in un array di caratteri e successivamente visualizzare l’array

//import java.util.Scanner; // Importo scanner(un package) 
public class TwoString{
	public static void main(String []arg){	
		//Scanner input = new Scanner (System.in);
		String stringOne = "StringaOne";
		String stringTwo = "StringaTwo";
		
		
		if(stringOne.equals(stringTwo)){
			System.out.println("Ok");
		}
		
		int one = stringOne.length();
		int two = stringTwo.length();
		System.out.println("Lunghezza Stringa 1:"+ one +"Lunghezza Stringa 2:"+ two);
		
		char arr[] = new char[two];
		
		for(int i=0; i<two; i++){
			arr[i] = stringTwo.charAt(i);
			System.out.println("Stampa Array n."+ (i+1) +": contenuto("+ arr[i] +")");
		}
		
		
		
	}
}