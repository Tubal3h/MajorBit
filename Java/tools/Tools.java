 //Importa la classe scanner del package util
 import java.util.Scanner;
public class Tools {
    public static void main(String[] args) {
		//Scanner Tipo | input nome var | new crea un oggetto di tipo Scanner
		Scanner input = new Scanner(System.in);
		
		//Utils Tipo | num nome var | new crea un oggetto di tipo Utils
        Utils num = new Utils();
		//var riutilizzabile
		int data = 0;
		boolean run = true;
		String myString = "";
		while(run){
			//pulisce la console fornito da AI
			//_________________________________
			Utils.clearConsole();
			//console 
			System.out.println("_________________________________________________________");
			System.out.println("|                                                        |");
			System.out.println("|                  Scegli il programma                   |");
			System.out.println("|                                                        |");
			System.out.println("|                     1. Pari Dispari                    |");
			System.out.println("|                     2. Minor                           |");
			System.out.println("|                     3. Factorial                       |");
			System.out.println("|                     4. Duplicate                       |");
			System.out.println("|                     5. Trova numero                    |");
			System.out.println("|                     6. Trova carattere                 |");
			System.out.println("|                     7. Inverti testo                   |");
			System.out.println("|                    00. Per chiudere                    |");
			System.out.println("|                                                        |");
			System.out.println("|________________________________________________________|");
			System.out.print("Digita numero scelta : ");
			data = input.nextInt();
			
			switch(data){
				case 1:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                     Pari Dispari                       |");
					System.out.println("|________________________________________________________|");
					
					System.out.println("Numero Pari o Dispari");
					System.out.print("Inserisci il numero : ");
					
					//data contiene il dato input
					data = input.nextInt();
					
					//condizione con all'interno gia il metodo
					if(num.pariDisp(data) == 0){
						//console print per mostrare il testo(risultato)
						System.out.println("Il numero è Pari");
					}else{
						//console print per mostrare il testo(risultato)
						System.out.println("Il numero è Dispari");
					}
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 2:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                        Minor                           |");
					System.out.println("|________________________________________________________|");
					
					//int Tipo | dataArrayMinor Nome array | new crea un oggetto 
					int [] dataArrayMinor = new int[5];  
					
					//ciclo for per popolare l'array >>>-----> dataArrayMinor
					for (int i = 0; i < dataArrayMinor.length; i++) {
						System.out.print("Inserisci il numero " + (i + 1) + ": ");
						dataArrayMinor[i] = input.nextInt();  
					}
					//print numero minore dell'array >>>-----> dataArrayMinor con il metodo 
					System.out.println("Il numero più piccolo è: " + num.Minor(dataArrayMinor));
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 3:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                      Factorial                         |");
					System.out.println("|________________________________________________________|");
					//console 
					System.out.print("Inserisci un numero (da 1 a 20) : ");
					//data contiene il dato input
					data = input.nextInt();
					//print numero fattoriale di data con il metodo 
					System.out.println("Il fattoriale è: " + num.Factorial(data));     
					// chiusura oggetto scanner 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 4:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                      Duplicate                         |");
					System.out.println("|________________________________________________________|");
					//dichiarazione array
					//int [] dataArrayDuplicate = {12, 323, 435, 78, 75, 59, 6567, 345, 1, 30};
					int [] dataArrayDuplicate = {12, 12, 435, 78, 78, 59, 6567, 345, 1, 30}; 
					//console 
					//System.out.print("Inserisci numero controllare: ");
					//data contiene il dato input
					//data = input.nextInt();
					//if else con metodo come condizione
					//System.out.println(num.Duplicate(dataArrayDuplicate, data);
					int[] found = num.Duplicate(dataArrayDuplicate);
					if(found[0] == 0){
						for(int i=1; i<found.length; i++){
							if(found[i] != 0){
								System.out.println("Il numero "+ found[i] +"  è stato trovato!");
							}
							
						}
					}else{
						System.out.println("Il numero inserito non è stato trovato!");
					};
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 5:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                     Trova numero!                      |");
					System.out.println("|________________________________________________________|");
					//dichiarazione array
					int [] dataArrayDuplicateV2 = {12, 323, 435, 78, 75, 59, 6567, 345, 1, 30}; 
					//console 
					System.out.print("Inserisci numero controllare: ");
					//data contiene il dato input
					data = input.nextInt();
					//if else con metodo come condizione
					//System.out.println(num.Duplicate(dataArrayDuplicate, data);
					int index = num.findNum(dataArrayDuplicateV2, data);
					if(index == -1){
						System.out.println("Il numero " + (data) +"non è stato trovato! Index: -1" );
					}else{
						System.out.println("Il numero " + (data) +" è stato trovato! Index: " + index);
					};
					//console
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 6:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                   Trova carattere!                     |");
					System.out.println("|________________________________________________________|");
					//dichiarazione array
					String word = "soqquadro";
					//console 
					System.out.print("Inserisci carattere da controllare: ");
					//myString contiene il dato input
					myString = input.next();
					//data contiene il primo catattere presente nells stringa grazie a charAt(0) e (char) effettua
					//il casting di data
					data = myString.charAt(0);
					//metodo che ritorna un boolean word è la stringa e (char) data contiene il char castato di nuovo perche if lo vede ancora
					// come int (il tipo prima del casting)
					if(num.findChar(word, (char) data)){
						System.out.println("Carattere presente nella parola." );
					}else{
						System.out.println("Carattere non presente nella parola.");
					};
					//console
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 7:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//_________________________________
					//console 
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                    Inverti parola.                     |");
					System.out.println("|________________________________________________________|");
					System.out.println("Inserisci parola da invertire: ");
					myString = input.next();
					//data contiene il primo catattere presente nells stringa grazie a charAt(0) e (char) effettua
					//il casting di data
					char[] arrInvert = num.invertString(myString);
					System.out.print("Il testo invertito è: ");
					for(int i=0; i<arrInvert.length; i++){
						System.out.print(arrInvert[i]);
					}
					System.out.println("");
					//console
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					//data contiene il dato input
					data = input.nextInt();
					//permette di chiudere il programma con la flag con una scelta
					if(data == 2){
						run = false;
					};
					break;
				case 00:
					//pulisce la console fornito da AI
					Utils.clearConsole();
					//console
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|                   Programma Chiuso.                    |");
					System.out.println("|________________________________________________________|");
					//flag che permette di uscire dal while
					run = false;
					break;

				default:
					break;
			}//switch
		}//while
		input.close(); 
	}//main
}//class
