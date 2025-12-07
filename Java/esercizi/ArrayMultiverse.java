package esercizi;
// Inizializzare un array bidimensionale 3x4 e 
// visualizzare la media aritmetica di ogni riga di valori.

// import java.util.Scanner; 
public class ArrayMultiverse{
    public static void main (String [] args){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };




        for(int i=0; i<3; i++){
            int sum = 0;
            float med = 0;
            for(int j=0; j<4; j++) {
                sum = sum + arr[i][j];
            }
            med = (float) sum / 4;
            System.out.println("La media aritmetica della riga " + (i+1) + " equivale a: " + med);
        }

    }
}


// Inizializzare con numeri interi un array bidimensionale 5x6 e caricare in un array monodimensionale la somma dei valori di ogni colonna. 
// Inizializzare un array con 10 numeri interi e visualizzare il numero più piccolo, il numero più grande e la media aritmetica dei numeri.