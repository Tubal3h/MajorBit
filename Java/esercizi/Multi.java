package esercizi;
public class Multi {
    public static void main (String [] args){
        int arr[][] = {
            {33, 5, 9, 83, 31, 77},
            {98, 66, 80, 88, 2, 41},
            {20, 88, 38, 58, 27, 95},
            {69, 46, 97, 50, 34, 16},
            {7, 42, 89, 33, 6, 69}
        };

        int arrSum[] = new int[6];

        int sum = 0;

        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                sum = sum + arr[j][i];
            }
            arrSum[i] = sum;
            System.out.println(arrSum[i]);
        }

    }
}
