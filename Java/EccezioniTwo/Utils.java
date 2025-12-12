import java.util.ArrayList;
import java.util.Scanner;
public class Utils {
	Scanner scanner = new Scanner(System.in);
	public void checkNumber(Integer n) throws NumberFormatException{
		if(n % 2 == 0){
			System.out.println("Pari \n");
		}else{
			System.out.println("Dispari \n");
		}		
	}
}