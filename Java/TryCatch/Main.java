
//Scrivere un’applicazione che esegua 5 divisioni 
//il cui dividendo deve essere un numero costante, 
// mentre i divisori devono essere acquisiti da tastiera, 
// il tutto gestendo l’ eccezione per la divisione 
//per 0 senza uscire dal programma, 
//ma assicurandosi di inserire tutte e cinque i numeri.
import java.util.Scanner; 
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int dividendo = 10;
		int result = 0;
        for(int i=0; i<5; i++){
            try {
                System.out.println("Inserire il "+(i+1)+"° numero:");
				result = dividendo/scanner.nextInt();
				System.out.println("Risultato:"+ result +"\n");
            } catch (ArithmeticException e) {
                System.out.println("Errore: "+ e +"\n");
				i--;
            }
        }
    }
}
