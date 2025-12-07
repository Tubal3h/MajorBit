
public class Utils {
	//pulisce la console fornito da AI
	//____________________________________________________
	public static void clearConsole() {

        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Impossibile pulire la console");
        }
    }
	//____________________________________________________		
	//Metodo che controlla se un numero e pari o dispari
	//dando come ritorno 1 o 0
    public int pariDisp(int c){
		//if else che controlla il resto e 0
        if(c %2 == 0) {
			//0 se é pari
            c=0;
        }else{
			//1 se é dispari
            c=1;
        }
        return c;
    }
    //Metodo che trova il numero minimo traminte un array
    public int Minor(int arr[]) { 
	
		//int Tipo | min nome var | arr[0]; prende 
		//il primo valore dell'array
        int min = arr[0];
		
		//for che cicla a seconda della lunghezza dell'array
        for (int i = 1; i < arr.length; i++) {  
			//controlla se il valore dell'array e piu piccolo del min attuale
            if (arr[i] < min) {  
				//assegnazione del nuovo minimo 
                min = arr[i];
            }
        }
		//ritorna il minimo
        return min;
    }
	//Metodo che esegue il fattoriale di un numero
	public long Factorial(long data) {  
		//tipo: long, Nome var result
		long result = 1;
		//ciclo for che moltiplica a seconda del valore data
		for(long i=1; i<=data; i++){
			//abbreviazione di result = result * i;
			result *= i;
		}
        return result;
    }
	//metodo che controlla se ci sono duplicati in un array
	public int[] Duplicate(int arr[]) {
		
		//dichiarazione dell'array
		int[] arrDuplicateNum = new int[3];
		arrDuplicateNum[0] = 1;
		int a=1;
		// il primo for prende il primo numero e viene  confrontato
		// con tutto l'array con il secondo for
		for(int i=0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					arrDuplicateNum[0] = 0;
					arrDuplicateNum[a] = arr[i];
					a++;
				}
			}
		}
		return arrDuplicateNum;
	}
	//metodo che trova se un numero e presente nell'array
	public int findNum(int arr[], int n) {
		boolean found = false;
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == n){
				found = true;
				// assegna la possizione ad index
				index = i;
				break;
			}
		}
		// se non viene trovato ritorna -1
		if(!found) {
			index = -1;
		}
		return index;
	}
	//metodo che trova se un carattere e presente nella parola
	public boolean findChar(String word, char c) {
		boolean found = false;
		//metodo che controlla se c è presente sulla parola
		if(word.indexOf(c) != -1){
			found = true;
		}
		return found;
	}
	
	public char[] invertString(String word) {
		char[] arr = new char[word.length()];
		for(int i=0; i<word.length(); i++ ){
			arr[word.length()-i-1] = word.charAt(i);
		}
		return arr;
	}
}


//Creare all'interno della classe Utile un metodo chiamato Inverti 
//che presa in input una stringa mi restituisca un array di caratteri con i caratteri invertiti