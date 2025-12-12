
//Creare con ArrayList 
//un array di String dinamico 
//chiedendo le stringhe da tastiera, poi scorrerlo  
//visualizzando la lunghezza di ogni stringa 
//in esso contenuto. cose un string dinamico
import java.util.*;

public class Main {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<String>();
        String wordInput;
        boolean run = true;
        int count = 0;
        while(run){
            System.out.println("+---------------------------------------------");
            System.out.println("|Digita la "+(count+1)+"° parola o digita Termina.");
            System.out.println("+---------------------------------------------");
            wordInput = scanner.nextLine();
            wordInput.toLowerCase();
            if(wordInput.equals("termina")){
                if(inputList.size() <= 0){
                    System.out.println("+---------------------------------------------");
                    System.out.println("|Inserire almeno una parola.");
                    System.out.println("+---------------------------------------------");
                }else{ 
                    run = false;
                }
            }else{
				inputList.add(wordInput);
				count++;
			}
        }
        for(int i=0; i<inputList.size(); i++){
            System.out.println("La "+(i+1)+"° parola è lunga: "+inputList.get(i).length()+" caratteri.");
        }
    }

}
