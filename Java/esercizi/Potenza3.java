package esercizi;
//Inizializzare due variabili numeriche corrispondenti alla base a all’ esponente (base strettamente positiva, esponente intero relativo) e visualizzarne la potenza.
// importa un package
import java.util.Scanner;
/////////////////////////

// Potenza nome della classe
// public class Potenza{
	
// 	// main colui che esegue
// 	public static void main(String []arg){
		
// 		// input e di tipo Scanne = new è la parola chiave che crea un oggetto
// 		Scanner input = new Scanner (System.in);
// 		//boolean Tipo
// 		//NumOne Nome variabile
// 		// = assegnazione
// 		// true il valore
// 		boolean NumOne = true;
		
// 		boolean NumTwo = true;
		
// 		long n1 = 0;
// 		long n2 = 0;
// 		double result = 1;
		
// 			System.out.println("____________________________________");
// 			System.out.println("Inserisci valore base.");
// 			n1 = input.nextInt();
// 			System.out.println("____________________________________");

			
// 			System.out.println("____________________________________");
// 			System.out.println("Inserisci valore all'esponente.");
// 			n2 = input.nextInt();
// 			System.out.println("____________________________________");
		
		
// 		input.close();
// 		for(int i=0; i<n2; i++){
// 			result = result * n1;
// 		}
		
// 		if(n2 < 0){
// 			result = 1/(result);
// 			System.out.println("entrato");
// 		}

// 		System.out.println("╔════════════════════╗");
// 		System.out.println("║    /\\_/\\           ║");
// 		System.out.println("║   ( o.o )          ║");
// 		System.out.println("║    > ^ <           ║");
// 		System.out.println("║   /|   |\\          ║");
// 		System.out.println("║  (_|   |_)         ║");
// 		System.out.println("║                    ║");
// 		System.out.println("║ Risultato: "+ result +"!     ║");
// 		System.out.println("╚════════════════════╝");
		
// 	}
// }

// Inizializzare due variabili numeriche corrispondenti 
// alla base a all’ esponente (base strettamente positiva, 
// esponente intero relativo) e visualizzarne la potenza.
// con input da utente di base ed esponente
// la base e l'esponente possono essere negativi
 
 
import java.util.Scanner;
public class Potenza3{
	public static void main(String[] args){
	Scanner s;
	s = new Scanner(System.in); //creazione dell'oggetto s
	System.out.println("Inserisci il numero della base"); 	//input da utente per la base
	int a = s.nextInt();
	System.out.println("Inserisci il numero dell'esponente"); //input da utente per la base
	int x = s.nextInt();
	float P=a;
	int i;
	int P2=0;
	if (x>0){i=x-1;}
	else{i=(x*-1)-1;}	
		for (;i>0;i--){
			P=P*a;
			P2=(int)P;
		}
		if (x==0){
			P2=1;
			System.out.println("Il risultato della potenza è pari a : "+P2);}
		else if (x<0){
			P=1/(P);
			System.out.println("Il risultato della potenza è pari a : "+P);}
		else {
			System.out.println("Il risultato della potenza è pari a : "+P2);
		}
		}
	}