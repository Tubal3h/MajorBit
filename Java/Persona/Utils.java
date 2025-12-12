

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
	//___________________________________



    public static ArrayList<Studente> lowGradeStudentes(ArrayList<Studente> arr){
        if(arr == null || arr.size() == 0){
           System.out.println("Zero studenti inseriti");
           return null;
        }else{
            ArrayList<Studente> student = new ArrayList<Studente>(1);
            student.add(arr.get(0));
            if(arr.size() > 1){
                for(int i=1; i<arr.size(); i++){
                    if(arr.get(i).getAverage() <= student.get(0).getAverage()){
                        if(arr.get(i).getAverage() < student.get(0).getAverage()){
                            student.clear();
                            student.add(arr.get(i));
                        }else{
                            student.add(arr.get(i));
                        }
                    }
                }
            }
            return student;
        }
    }

    public static void countLowGrades(ArrayList<Studente> arr){
        int physics = 0;
        int math = 0;
        int informatic = 0;
        int story = 0;
        for(Studente s : arr){
            if(s.getPhysics() <= 5){
                physics++;
            }
            if(s.getMath() <= 5){
                math++;
            }
            if(s.getInformatic() <= 5){
                informatic++;
            }
            if(s.getStory() <= 5){
                story++;
            }
        }
        if(physics > 0){
            System.out.println("Fisica: " + physics);
        }
        if(math > 0){
            System.out.println("Matematica: " + math);
        }
        if(informatic > 0){
            System.out.println("Informatica: " + informatic);
        }
        if(story > 0){
            System.out.println("Storia: " + story);
        }
        
    }

    // public static double  calcSalary(Employee employee){
    //     return (employee.getSalary() + employee.getBonus());
    // }

    // public static double  calcSalary(Sellers sellers){
    //     return (sellers.getSalary() + sellers.getCommissions());
    // }

//     public static ArrayList<Studente> lowGradeStudentes(ArrayList<Studente> arr){
//     try {
//         if(arr == null || arr.size() == 0){
//             System.out.println("Zero studenti inseriti");
//             return null;
//         }else{
//             ArrayList<Studente> student = new ArrayList<Studente>(1);
//             student.add(arr.get(0));        
//             if(arr.size() > 1){
//                 for(int i=1; i<arr.size(); i++){
//                     if(arr.get(i).getAverage() <= student.get(0).getAverage()){
//                         if(arr.get(i).getAverage() < student.get(0).getAverage()){
//                             student.clear();
//                             student.add(arr.get(i));
//                         }else{
//                             student.add(arr.get(i));
//                         }
//                     }
//                 }
//             }
//             return student;
//         }
//     } catch (IndexOutOfBoundsException e) {
//         System.out.println("Errore: indice fuori dai limiti dell'array");
//         return null;
//     } catch (NullPointerException e) {
//         System.out.println("Errore: oggetto Studente null");
//         return null;
//     }
// }
    public static String subjectSelected(int subject){
        String subjectString = "";
        if(subject == 1){
            subjectString = "Fisica";
        }else if(subject == 2){
            subjectString = "Matematica";
        }else if(subject == 3){
            subjectString = "Informatica";
        }else if(subject == 4){
            subjectString = "Storia";
        }
        return subjectString;
    }

    public static boolean votoCheck(ArrayList<Studente> arr,int index,int subject,int data) throws ErrorCatch{
        boolean run = true;
        if(data >= 0 && data <= 10){
            switch (subject) {
                case 1:
                    arr.get(index).setPhysics(data);
                    break;
                case 2:
                    arr.get(index).setMath(data);
                    break;
                case 3:
                    arr.get(index).setInformatic(data);;
                    break;
                case 4:
                    arr.get(index).setStory(data);
                    break;
            
                default:
                    break;
            }
            run = false;
            return run;
        }else{
            throw new ErrorCatch();
        }
    }

    public static void getDataModified(ArrayList<Studente> arr, int index, int subject){
        switch (subject) {
            case 1:
                System.out.println("|                 "+subjectSelected(subject)+": "+ arr.get(index).getPhysics() );
                break;
            case 2:
                System.out.println("|                 "+subjectSelected(subject)+": "+ arr.get(index).getMath() );
                break;
            case 3:
                System.out.println("|                 "+subjectSelected(subject)+": "+ arr.get(index).getInformatic() );
                break;
            case 4:
                System.out.println("|                 "+subjectSelected(subject)+": "+ arr.get(index).getStory() );
                break;
        
            default:
                break;
        }
    }
}

