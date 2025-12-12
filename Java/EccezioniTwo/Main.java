import java.util.Scanner;
import java.util.ArrayList;
//main>utils>exemption
public class Main {
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	Utils utils = new Utils();
	Integer n= 0;
	System.out.println("Inserisci un numero: \n");
	try{		
		n.parseInt(scanner.next());
		utils.checkNumber(n);
	}catch(NumberFormatException e){
		System.out.println("!!ATTENZIONE!!" + e + "\n");
	}
		

	}
}