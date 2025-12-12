import java.util.Scanner;
import java.util.ArrayList;
//main>utils>exemption
public class Main {
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Utils utils = new Utils();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quanti numeri si vuole inserire: \n");
		int count = scanner.nextInt();
		boolean run = true;
		while(run){
			try{		
				run = utils.checkNumber(arr, count);
			}catch(ErrorCatch e){
				System.out.println("!!ATTENZIONE!!" + e + "\n");
			}
		}

	}
}