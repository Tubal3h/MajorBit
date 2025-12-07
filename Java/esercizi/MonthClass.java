package esercizi;
 // Inizializzare un array con 5 numeri compresi fra 1 e 12 e considerandoli mesi dell’anno visualizzare per ognuno il numero massimo di giorni

import java.util.Scanner; 
public class MonthClass{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int monthsData[][] = {
            { 2, 4, 7, 9, 11},
            { 28, 30, 30, 30, 30}
        };
        String monthsNames[] = {"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"};
        
        int qtInput = 5;
        int[] inputMonths = new int[qtInput];
        int num =0;
        for(int i=0; i<qtInput; i++) {
            boolean validNum = false; 
            while(!validNum){
                System.out.println("_________________________________");
                System.out.println("Inserire il mese:");
                inputMonths[i] = input.nextInt();
                System.out.println("_________________________________");

                if(inputMonths[i] >= 1 && inputMonths[i] <= 12){
                    inputMonths[i] = num;  
                    validNum = true;
                } else {
                    System.out.println("Inserire un numero compreso tra 1 e 12!!!");
                }
            }
        }

        for(int month=0; month<qtInput; month++) {
            boolean found = false;  
            for(int monthUnder31=0; monthUnder31<qtInput; monthUnder31++) {  
                if(inputMonths[month] == monthsData[0][monthUnder31]) {
                    System.out.println("Il mese " + monthsNames[inputMonths[month]-1] + " ha " + monthsData[1][monthUnder31] + " giorni");
                    found = true;
                    break;  
                }
            }
            if(!found) {
                System.out.println("Il mese " + monthsNames[inputMonths[month]-1] + " ha 31 giorni.");
            }
        }
    }
}
