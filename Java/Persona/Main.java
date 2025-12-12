
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
		
		Employee[] employeesArray = {
			// ---- 25 EMPLOYEE ----
			new Employee(1,  "Mario",     "Rossi",    "333001", "Via Roma 1",     "Milano",        1500),
			new Employee(2,  "Luigi",     "Verdi",    "333002", "Via Milano 2",   "Torino",        1600, 250),
			new Employee(3,  "Anna",      "Bianchi",  "333003", "Via Dante 3",    "Napoli",        1800),
			new Employee(4,  "Giulia",    "Neri",     "333004", "Via Fiori 4",    "Roma",          2000, 300),
			new Employee(5,  "Paolo",     "Gialli",   "333005", "Piazza A 5",     "Firenze",       1400),
			new Employee(6,  "Sara",      "Blu",      "333006", "Vicolo B 6",     "Venezia",       1700, 220),
			new Employee(7,  "Luca",      "Marroni",  "333007", "Corso C 7",      "Bologna",       1550),
			new Employee(8,  "Marco",     "Viola",    "333008", "Viale D 8",      "Genova",        2100, 350),
			new Employee(9,  "Elena",     "Rosa",     "333009", "Piazza E 9",     "Bari",          1900),
			new Employee(10, "Fabio",     "Grigi",    "333010", "Via F 10",       "Palermo",       1300, 180),

			new Employee(11, "Chiara",    "Arancio",  "333011", "Via G 11",       "Catania",       1750),
			new Employee(12, "Davide",    "Celeste",  "333012", "Via H 12",       "Trieste",       1600, 210),
			new Employee(13, "Martina",   "Ocra",     "333013", "Via I 13",       "Verona",        1850),
			new Employee(14, "Giorgio",   "Smeraldo", "333014", "Via L 14",       "Pisa",          2000, 280),
			new Employee(15, "Laura",     "Turchese", "333015", "Via M 15",       "Parma",         1700),
			new Employee(16, "Roberto",   "Indaco",   "333016", "Via N 16",       "Modena",        1500, 190),
			new Employee(17, "Silvia",    "Magenta",  "333017", "Via O 17",       "Brescia",       2100),
			new Employee(18, "Andrea",    "Ciano",    "333018", "Via P 18",       "Bergamo",       1950, 260),
			new Employee(19, "Matteo",    "Lavanda",  "333019", "Via Q 19",       "Padova",        1550),
			new Employee(20, "Francesca", "Corallo",  "333020", "Via R 20",       "Taranto",       1650, 230),

			new Employee(21, "Simone",    "Beige",    "333021", "Via S 21",       "Messina",       1450),
			new Employee(22, "Valentina", "Panna",    "333022", "Via T 22",       "Prato",         2200, 400),
			new Employee(23, "Lorenzo",   "Miele",    "333023", "Via U 23",       "Reggio Emilia", 1750),
			new Employee(24, "Federica",  "Zafferano","333024", "Via V 24",       "Livorno",       1600, 210),
			new Employee(25, "Antonio",   "Granata",  "333025", "Via Z 25",       "Ravenna",       1800),

			// ---- 25 SELLERS ----
			new Sellers(26, "Barbara",   "Argento",  "333026", "Via X 26",       "Rimini",        1900, 260),
			new Sellers(27, "Enrico",    "Oro",      "333027", "Via Y 27",       "Salerno",       1500, 300),
			new Sellers(28, "Pietro",    "Platino",  "333028", "Via W 28",       "Ferrara",       2100, 350),
			new Sellers(29, "Giovanni",  "Bronzo",   "333029", "Via J 29",       "Sassari",       1400, 200),
			new Sellers(30, "Claudio",   "Rame",     "333030", "Via K 30",       "Latina",        1750, 280),

			new Sellers(31, "Marta",     "Cobalto",  "333031", "Via Lunga 31",   "Perugia",       1650, 220),
			new Sellers(32, "Stefano",   "Piombo",   "333032", "Via Stretta 32", "Ancona",        1850, 260),
			new Sellers(33, "Ilaria",    "Zaffiro",  "333033", "Via Mare 33",    "La Spezia",     2000, 320),
			new Sellers(34, "Nicola",    "Ambra",    "333034", "Via Lago 34",    "Como",          1550, 300),
			new Sellers(35, "Alessia",   "Perla",    "333035", "Via Sole 35",    "Lecce",         1700, 250),

			new Sellers(36, "Emanuele",  "Quarzo",   "333036", "Via Luna 36",    "Trento",        1950, 280),
			new Sellers(37, "Noemi",     "Corniola", "333037", "Via Colle 37",   "Bolzano",       1600, 220),
			new Sellers(38, "Riccardo",  "Granito",  "333038", "Via Bosco 38",   "Udine",         1850, 260),
			new Sellers(39, "Serena",    "Giada",    "333039", "Via Campo 39",   "Aosta",         1500, 210),
			new Sellers(40, "Alberto",   "Onice",    "333040", "Via Fiume 40",   "Pescara",       1800, 270),

			new Sellers(41, "Cristina",  "Topazio",  "333041", "Via Castello 41","Cosenza",       1700, 230),
			new Sellers(42, "Tommaso",   "Rubino",   "333042", "Via Torre 42",   "Catanzaro",     1600, 240),
			new Sellers(43, "Veronica",  "Malachite","333043", "Via Ponte 43",   "Foggia",        1550, 220),
			new Sellers(44, "Gabriele",  "Ametista", "333044", "Via Vigna 44",   "Agrigento",     1900, 270),
			new Sellers(45, "Elisa",     "Agata",    "333045", "Via Ulivo 45",   "Siracusa",      1750, 260),

			new Sellers(46, "Daniele",   "Opale",    "333046", "Via Pino 46",    "Cagliari",      2000, 0),
			new Sellers(47, "Chiara",    "Cristallo","333047", "Via Rovere 47",  "Monza",         1650, 0),
			new Sellers(48, "Filippo",   "Diaspro",  "333048", "Via Piave 48",   "Vicenza",       1850, 0),
			new Sellers(49, "Roberta",   "Sabbia",   "333049", "Via Tevere 49",  "Terni",         1550, 0),
			new Sellers(50, "Giorgia",   "Fumo",     "333050", "Via Arno 50",    "Lucca",         1900, 0)
		};

		ArrayList<Employee> employeesArrayList = new ArrayList<Employee>(Arrays.asList(employeesArray));
        
        while (run) {
			Utils.clearConsole();
			//Stampa console
			System.out.println("_________________________________________________________");
			System.out.println("|                                                        |");
			System.out.println("|                  Scegli il programma                   |");
			System.out.println("|                                                        |");
			System.out.println("|                     1.Studente media voti.             |");
			System.out.println("|                     2.Stipendi.                        |");
			System.out.println("|                     3. Cambio voto studente.          |");
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
				case 2:
					while(run){
						Utils.clearConsole();
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|              Informazioni Impiegati.                    |");
						System.out.println("|              Vuoi vedera la lista?                     |");
						System.out.println("|              1) Si                                     |");
						System.out.println("|              2) No                                     |");
						System.out.println("|________________________________________________________|");
						data = scanner.nextInt();
						Utils.clearConsole();
						if(data == 1){
							if(employeesArrayList != null){
								System.out.println("_________________________________________________________");
								System.out.println("|                                                        |");
								System.out.println("|                        Impiegati:                      |");
								System.out.println("|________________________________________________________|");
								for(Employee e : employeesArrayList){
									e.getAllData();
								}
							}else{
								System.out.println("Nessuno impiegato trovato o lista vuota.");
							}
							run = false;
						}else if(data == 2){
							if(employeesArrayList != null){
								System.out.println("_________________________________________________________");
								System.out.println("|                                                        |");
								System.out.println("|                        Impiegati:                      |");
								System.out.println("|________________________________________________________|");
								for(Employee e : employeesArrayList){
									System.out.println(e);
								}
							}else{
								System.out.println("Nessuno impiegato trovato o lista vuota.");
							}
							run = false;
						}						
					}
					run = true;
					System.out.println("");
					System.out.println("");
					System.out.println("");
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
				case 3:
					int index = 0;
					int menu = 0;
					int subject = 0;
					while(run){

						Utils.clearConsole();
						if(menu <1 && menu  > 3 ){
							System.out.println("Comando non valido.");
						}
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|              Vuoi modificare il voto di:               |");
						System.out.println("+---------------------------------------------------------");
						System.out.println("|                 Nome: "+ arrListStudents.get(index).getName() );
						System.out.println("|                 Cognome: "+ arrListStudents.get(index).getSurname() );
						System.out.println("|                 Fisica: "+ arrListStudents.get(index).getPhysics() );
						System.out.println("|                 Matematica: "+ arrListStudents.get(index).getMath() );
						System.out.println("|                 Informatica: "+ arrListStudents.get(index).getInformatic() );
						System.out.println("|                 Storia: "+ arrListStudents.get(index).getStory() );
						System.out.println("+---------------------------------------------------------");
						System.out.println("|              1) Successivo                             |");
						if(index <= 0){
							System.out.println("|                                                        |");
						}else{
							System.out.println("|              2) Indietro                               |");
						}
						System.out.println("|              3) Si                                     |");
						System.out.println("|________________________________________________________|");
						menu = scanner.nextInt();
						
						if(menu == 1){
							index++;
						}else if(menu == 2){
							index--;
						}else if(menu == 3){
							run = false;
						}
						
					}
					run = true;
					while(run){
						System.out.println("_________________________________________________________");
						System.out.println("|                                                        |");
						System.out.println("|                     Scegli la materia:                 |");
						System.out.println("|                                                        |");
						System.out.println("|                     1. Fisica                          |");
						System.out.println("|                     2. Matematica                      |");
						System.out.println("|                     3. Informatica                     |");
						System.out.println("|                     4. Storia                          |");
						System.out.println("|                                                        |");
						System.out.println("|________________________________________________________|");
						subject = scanner.nextInt();
						if(subject >= 1 && subject <= 4){
							run = false;
						}
					}
					run = true;
					while (run) {
						System.out.println("+----------------------------------------------------");
						System.out.println("|     Inserisci il nuovo voto di "+ Utils.subjectSelected(subject)+": ");
						System.out.println("+----------------------------------------------------");
						data = scanner.nextInt();
						try {
							run = Utils.votoCheck(arrListStudents, index, subject, data);
						} catch (ErrorCatch e) {
							System.err.println(e);
						}
					}

					System.out.println("+---------------------------------------------------------");
					System.out.println("|                 Nome: "+ arrListStudents.get(index).getName() );
					System.out.println("|                 Cognome: "+ arrListStudents.get(index).getSurname() );
					Utils.getDataModified(arrListStudents, index, subject);
					System.out.println("+---------------------------------------------------------");

					run = true;
					System.out.println("");
					System.out.println("");
					System.out.println("");
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