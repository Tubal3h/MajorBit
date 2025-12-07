package esercizi;
public class TenNumbers {
        public static void main (String [] args){
            int arr[] = {1,2,3,4,5,6,7,8,9,10};

            int min = arr[0];
            float med = 0;
            int max = arr[0];
            int sum = 0;

            for(int i=0; i<10; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
                sum =  sum + arr[i];
            }

            med = (float) sum/10;
            System.out.println("min: " + min + " med: " + med + " max: "+ max);
    }
}
