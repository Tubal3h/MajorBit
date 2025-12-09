/* Creare una sottoclasse di Scatola di nome ScatolaPeso aggiungendo il peso 
(int) con relativi metodi set e get, 
quindi creare un sorgente che utilizzi oggetti di entrambe le classi.
2.Creare una sottoclasse di ScatolaPeso di nome 
ScatolaColore aggiungendo il colore (String) 
con relativi metodi set e get, quindi creare un’ applicazione
 java che utilizzi oggetti di entrambe le classi.  */

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Utils utils = new Utils();
        double[] arrBoxes = new double[4];
		boolean run = true;
		int data = 0;
		double sum = 0;
		
		while(run){
			Utils.clearConsole();
			System.out.println("_________________________________________________________");
			System.out.println("|                                                        |");
			System.out.println("|                  Scegli il programma                   |");
			System.out.println("|                                                        |");
			System.out.println("|                     1. Box con Volume maggiore.        |");
			System.out.println("|                     2. Somma misure delle box.         |");
			//System.out.println("|                     3. Factorial                       |");
			//System.out.println("|                     4. Duplicate                       |");
			//System.out.println("|                     5. Trova numero                    |");
			//System.out.println("|                     6. Trova carattere                 |");
			//System.out.println("|                     7. Inverti testo                   |");
			System.out.println("|                    00. Per chiudere                    |");
			System.out.println("|                                                        |");
			System.out.println("|________________________________________________________|");
			System.out.print("Digita numero scelta : ");
			data = input.nextInt();
			
			switch(data){
				case 1:
					Utils.clearConsole();
					for(int i=0; i<arrBoxes.length; i++){
						//console
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci altezza della Box n"+(i+1)+":               |");
						System.out.println("|________________________________________________________|");
						double height = input.nextDouble();
						
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci lunghezza della Box n"+(i+1)+":             |");
						System.out.println("|________________________________________________________|");
						double length = input.nextDouble();
						
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci profondità della Box n"+(i+1)+":             |");
						System.out.println("|________________________________________________________|");
						double depth = input.nextDouble();

						/*
						-nel main creare un arraylist di scatole
						-aggiungere 3 scatole
						-verificare quante scatole ci sono nell'arraylist
						-stampare le scatole
						-modificare l'altezza di tutte le scatole a 7
						*/
						Box box = new Box(height, length, depth);
						BoxWeight boxWeight = new BoxWeight(0, 0, 0, 0);
						BoxColor boxcolor = new BoxColor(0, 0, 0, 0, null);
        
						
						arrBoxes[i] = box.calculateVolume(height, length, depth);
					}
					
					
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|   Il volume più grande è: "+ utils.greaterVolume(arrBoxes) +"                       |");
					System.out.println("|   ed è la Box n: "+ utils.getData() +" |");                 
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					data = input.nextInt();
					if(data == 2){
						run = false;
					};
					break;
				case 2:
					Utils.clearConsole();
					for(int i=0; i<arrBoxes.length; i++){
						sum = 0;
						//console
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci altezza della Box n"+(i+1)+":               |");
						System.out.println("|________________________________________________________|");
						double height = input.nextDouble();
						
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci lunghezza della Box n"+(i+1)+":             |");
						System.out.println("|________________________________________________________|");
						double length = input.nextDouble();
						
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|          Inserisci profondità della Box n"+(i+1)+":             |");
						System.out.println("|________________________________________________________|");
						double depth = input.nextDouble();

						
						Box box = new Box(height, length, depth);
						
						sum = sum + box.sumBoxSizes(height, length, depth);
					}
					
					
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|   Il volume più grande è: "+ sum +"                       |");
					//System.out.println("|   ed è la Box n: "+ index.getIndex() +" |");                 
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					data = input.nextInt();
					if(data == 2){
						run = false;
					};
					break;
				case 3:
											/*
						-nel main creare un arraylist di scatole
						-aggiungere 3 scatole
						-verificare quante scatole ci sono nell'arraylist
						-stampare le scatole
						-modificare l'altezza di tutte le scatole a 7
						*/


						ArrayList<Box> newArrayBoxes = new ArrayList<Box>();
						newArrayBoxes.add(new Box(1,2,3));
						newArrayBoxes.add(new Box(4,5,6));
						newArrayBoxes.add(new Box(7,8,9));
						newArrayBoxes.add(new BoxWeight(20, 30, 40, 15));
						newArrayBoxes.add(new BoxColor(5, 11, 22, 21, "rosso"));

						System.out.println("Dimension ArrayList: "+newArrayBoxes.size());
						for(Box i : newArrayBoxes){
							System.out.println(i);
						}
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");   
						System.out.println("|                                                        |");
						System.out.println("|            Vuoi eseguire un nuovo programma?           |");
						System.out.println("|                                                        |");
						System.out.println("|                     1. Si                              |");
						System.out.println("|                     2. No                              |");
						System.out.println("|                                                        |");
						System.out.println("|________________________________________________________|");
						data = input.nextInt();
						if(data == 2){
							run = false;
						};


					break;
				default:
					run = false;
					break;
			}
		}
        
        input.close();
    }
}


//Data la classe Scatola creare un’ applicazione java che istanzi 4 oggetti 
//di tipo Scatola e che visualizzi il volume maggiore. (metodo da inserire in utile)