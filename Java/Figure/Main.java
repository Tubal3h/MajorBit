import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        // Figure figure = new Figure(1,2);
        ArrayList<Figure> arrayList = new ArrayList<Figure>();
        arrayList.add(new Rectangle(10, 10));
        arrayList.add(new Triangle(20, 10));

        System.out.println("_________________________________________________________");
        System.out.println("|                                                        |");
        System.out.println("|                     Metodi @Override.                  |");
        System.out.println("|________________________________________________________|");

        System.out.println("Rettangolo" + arrayList.get(0).calcArea());
        System.out.println("Triangolo" + arrayList.get(1).calcArea());

        System.out.println("_________________________________________________________");
        System.out.println("|                                                        |");
        System.out.println("|                     Metodi Static.                     |");
        System.out.println("|________________________________________________________|");

        
        // System.out.println("Rettangolo" + Utils.calcAreaRectangle(arrayList.get(0).getBase(), arrayList.get(0).getHeight()));
		// System.out.println("Triangolo" + Utils.calcAreaRectangle(arrayList.get(1).getBase(), arrayList.get(1).getHeight()));
        // // Utils.calcAreaRectangle(arrayList.get(0).getBase(), arrayList.get(0).getHeight());
        System.out.println("Rettangolo: " + Utils.calcAreaRectangle(arrayList.get(0)));
        System.out.println("Triangolo: " + Utils.calcAreaTriangle(arrayList.get(1)));
        // Utils.calcAreaRectangle(arrayList.get(0).getBase(), arrayList.get(0).getHeight());
        // Utils.calcAreaTriangle(arrayList.get(1).getBase(), arrayList.get(1).getHeight());
        
    }
}