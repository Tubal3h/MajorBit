import java.util.ArrayList;
import java.util.Scanner;
public class Utils {
	Scanner scanner = new Scanner(System.in);
	public boolean checkNumber(ArrayList<Integer> arr,int count) throws ErrorCatch{
		int n = 0;
		boolean run = true;
		if(arr.size() != count){
			System.out.println("Inserire il "+(arr.size()+1)+"° numero: \n");
			n = scanner.nextInt();
			if(n < 0){
				throw new ErrorCatch(n);
			}else{
				arr.add(n);
			}
			run = true;
			return run;
		}else{
			System.out.println("Numeri inseriti: ");
			for(Integer a : arr){
				System.out.println(a + "\n");
			}
			run = false;
			return run;
		}
	}
}