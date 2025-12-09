package Persona;

import java.util.ArrayList;

public class Utils {
    //
	public static void clearConsole() {

        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Impossibile pulire la console");
        }
    }
	//____

    public static ArrayList<Studente> lowGradeStudentes(ArrayList<Studente> arr){
        // ArrayList<Studente> n = new ArrayList<>();

        if(arr == null || arr.size() == 0){
           System.out.println("Zero studenti inseriti");
           return null;
        }else{
            ArrayList<Studente> n = new ArrayList<Studente>(1);
            n.add(arr.get(0));
            if(arr.size() > 1){
                for(int i=1; i<arr.size(); i++){
                    if(arr.get(i).getAverage() <= n.get(0).getAverage()){
                        if(arr.get(i).getAverage() < n.get(0).getAverage()){
                            n.clear();
                            n.add(arr.get(i));
                        }else{
                            n.add(arr.get(i));
                        }
                    }
                }
            }
            return n;
        }
    }


}
