package Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
		//instanze oggetti
        Scanner scanner = new Scanner(System.in);

		//var riutilizzate o ridichiarate
        int data = 0;
        boolean run = true;
		//arraylist
		Studente[]  arrStudents= {
			new Studente("Mario", "Rossi", "333001", "Via Roma 1", "Milano", 6.0, 6.5, 7.0, 6.0),
			new Studente("Luigi", "Verdi", "333002", "Via Po 2", "Torino", 4.0, 5.0, 4.5, 5.0), 
			new Studente("Anna", "Bianchi", "333003", "Via Dante 3", "Napoli", 9.0, 9.5, 10.0, 9.0),
			new Studente("Giulia", "Neri", "333004", "Via Fiori 4", "Roma", 8.0, 8.0, 8.5, 8.0),
			new Studente("Paolo", "Gialli", "333005", "Piazza A 5", "Firenze", 3.0, 4.0, 3.0, 4.0), 
			new Studente("Sara", "Blu", "333006", "Vicolo B 6", "Venezia", 7.0, 7.5, 8.0, 7.0),
			new Studente("Luca", "Marroni", "333007", "Corso C 7", "Bologna", 5.5, 6.0, 5.5, 6.0),
			new Studente("Marco", "Viola", "333008", "Viale D 8", "Genova", 6.0, 6.0, 6.0, 6.0),
			new Studente("Elena", "Rosa", "333009", "Piazza E 9", "Bari", 10.0, 10.0, 10.0, 10.0), 
			new Studente("Fabio", "Grigi", "333010", "Via F 10", "Palermo", 4.0, 3.5, 4.0, 3.0), 
			new Studente("Chiara", "Arancio", "333011", "Via G 11", "Catania", 8.5, 9.0, 8.5, 9.0),
			new Studente("Davide", "Celeste", "333012", "Via H 12", "Trieste", 5.0, 5.0, 5.0, 5.0), 
			new Studente("Martina", "Ocra", "333013", "Via I 13", "Verona", 7.0, 6.5, 7.5, 7.0),
			new Studente("Giorgio", "Smeraldo", "333014", "Via L 14", "Pisa", 6.0, 5.5, 6.0, 5.5),
			new Studente("Laura", "Turchese", "333015", "Via M 15", "Parma", 9.0, 8.5, 9.5, 9.0),
			new Studente("Roberto", "Indaco", "333016", "Via N 16", "Modena", 4.5, 5.0, 5.5, 5.0),
			new Studente("Silvia", "Magenta", "333017", "Via O 17", "Brescia", 7.5, 8.0, 7.5, 8.0),
			new Studente("Andrea", "Ciano", "333018", "Via P 18", "Bergamo", 6.5, 6.5, 6.5, 6.5),
			new Studente("Matteo", "Lavanda", "333019", "Via Q 19", "Padova", 3.0, 3.0, 3.0, 3.0), 
			new Studente("Francesca", "Corallo", "333020", "Via R 20", "Taranto", 8.0, 8.5, 8.0, 8.5),
			new Studente("Simone", "Beige", "333021", "Via S 21", "Messina", 5.5, 5.5, 5.5, 5.5),
			new Studente("Valentina", "Panna", "333022", "Via T 22", "Prato", 9.5, 9.0, 9.5, 9.0),
			new Studente("Lorenzo", "Miele", "333023", "Via U 23", "Reggio", 6.0, 6.5, 6.0, 6.5),
			new Studente("Federica", "Zafferano", "333024", "Via V 24", "Livorno", 4.0, 4.0, 4.0, 4.0),
			new Studente("Antonio", "Granata", "333025", "Via Z 25", "Ravenna", 7.0, 7.0, 7.0, 7.0),
			new Studente("Barbara", "Argento", "333026", "Via X 26", "Rimini", 8.0, 8.0, 8.0, 8.0),
			new Studente("Enrico", "Oro", "333027", "Via Y 27", "Salerno", 5.0, 6.0, 5.0, 6.0),
			new Studente("Pietro", "Platino", "333028", "Via W 28", "Ferrara", 9.0, 9.0, 9.0, 9.0),
			new Studente("Giovanni", "Bronzo", "333029", "Via J 29", "Sassari", 3.5, 4.0, 3.5, 4.0),
			new Studente("Claudio", "Rame", "333030", "Via K 30", "Latina", 6.5, 6.0, 6.5, 6.0)
		};
		ArrayList<Studente> arrListStudents = new ArrayList<Studente>(Arrays.asList(arrStudents));

        
        while (run) {
			Utils.clearConsole();
			//Stampa console
			System.out.println("_________________________________________________________");
			System.out.println("|                                                        |");
			System.out.println("|                  Scegli il programma                   |");
			System.out.println("|                                                        |");
			System.out.println("|                     1.Studente media voti.             |");
			// System.out.println("|                     2. Tempio medio delle canzoni.     |");
			// System.out.println("|                     3. Mostra lista cantanti.          |");
			// System.out.println("|                     4. Mostra gli album.               |");
			//System.out.println("|                     5.                     |");
			//System.out.println("|                     6.                  |");
			//System.out.println("|                     7.                    |");
			System.out.println("|                    00. Per chiudere                    |");
			System.out.println("|                                                        |");
			System.out.println("|________________________________________________________|");
			System.out.print("Digita numero scelta : ");
            data = scanner.nextInt();
            switch (data) {
                case 1:
					while(run){
						Utils.clearConsole();
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|              Informazioni studenti.                    |");
						System.out.println("|              Vuoi vedera la lista?                     |");
						System.out.println("|              1) Si                                     |");
						System.out.println("|              2) No                                     |");
						System.out.println("|________________________________________________________|");
						data = scanner.nextInt();
						Utils.clearConsole();
						if(data == 1){
							for(Studente i : arrStudents){
								System.out.println(i);
							}
							run = false;
						}else if(data == 2){
							run = false;
						}						
					}
					run = true;
					if(Utils.lowGradeStudentes(arrListStudents) != null){
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						if(Utils.lowGradeStudentes(arrListStudents).size() >= 1){
							System.out.println("|              Studente con la media piu bassa:          |");
						}else{
							System.out.println("|              Studenti con la media piu bassa:          |");
						}
						System.out.println("|________________________________________________________|");
						for(Studente i : Utils.lowGradeStudentes(arrListStudents)){
							i.getAllData();
						}
					}else{
						System.out.println("Nessuno studente trovato o lista vuota.");
					}
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|              Numero insufficienze per materia:         |");
					System.out.println("|________________________________________________________|");
					Utils.countLowGrades(arrListStudents);
					System.out.println("_________________________________________________________");
					System.out.println("|                                                        |");
					System.out.println("|            Vuoi eseguire un nuovo programma?           |");
					System.out.println("|                                                        |");
					System.out.println("|                     1. Si                              |");
					System.out.println("|                     2. No                              |");
					System.out.println("|                                                        |");
					System.out.println("|________________________________________________________|");
					data = scanner.nextInt();
					if(data == 2){
						Utils.clearConsole();
						//console
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|                   Programma Chiuso.                    |");
						System.out.println("|________________________________________________________|");
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
            }
        }
		scanner.close();
    }
}