package esercizi;

// Inizializzare 2 array di 15 numeri ognuno e caricare in un terzo array 
// la somma degli elementi dei due array nella medesima posizione, 
// quindi visualizzare la somma più alta caricata nel terzo array.

public class Fifteen{
	public static void main(String []arg){	

        int[] arrayOne = {17, 3, 24, 8, 29, 11, 5, 22, 1, 19, 27, 9, 14, 30, 6};
        int[] arrayTwo = {21, 2, 13, 25, 7, 18, 28, 4, 16, 10, 23, 12, 26, 15, 20};

        int arrayLength = 15;
        
        int[] arrayThree = new int[arrayLength];

        for(int i=0; i<arrayLength; i++){      
            arrayThree[i] = arrayOne[i] + arrayTwo[i];
        }
        int max = arrayThree[1];
        for(int i=0; i<arrayLength; i++){
            if(max < arrayThree[i]) {
                max = arrayThree[i];
            }
        }
        System.out.println("Il numero piu grande è: "+ max);

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j < arrayLength; j++) {
                if (arrayThree[i] < arrayThree[j]) { 
                    int temp = arrayThree[i];
                    arrayThree[i] = arrayThree[j];
                    arrayThree[j] = temp;
                }
            }
        }

        for(int i=0; i< arrayLength; i++){
            System.out.println(arrayThree[i]);
        }
	}
}

// public class TerzoEserciziJavaQuattro{
// 	public static void main (String [] args){
// 		int arr1 []= {10,2,4,6,5,3};
// 		int arr2[]= {2,5,3,8,6,7};
// 		int arr3 [] = new int [6];
// 		int i=0;
// 		int j=0;
// 		int x=0;
// 		int k= arr3.length-1;
// 		boolean flag=false;
// 		int scambia;
// 		//riempio
// 		while(i<arr1.length-1 && j<arr2.length-1){
// 			arr3[x]= arr1[i]+arr2[j];
// 			i++;
// 			j++;
// 			System.out.println ( arr3[x]);
// 			x++;
// 		}

// 		//ordino
// 		do{
// 			flag= false;
// 			i=0;
// 		while (i<k){
// 			if ( arr3[i]>arr3[i+1]){
// 				scambia= arr3[i];
// 				arr3[i]= arr3[i+1];
// 				arr3[i+1]=scambia;
// 				flag=true;
// 			}
// 			i++;		
// 		}		
// 		k--;
// 		}while(k>=0 && flag== true);

// 		//stampo il più grande
// 		System.out.println("il numero pi\u00F9 alto \u00E8 :" + arr3[5]);
// 	}
// }