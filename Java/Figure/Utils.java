
public class Utils {
    public static double calcAreaRectangle(Figure rectangle){
        return rectangle.getBase()*rectangle.getHeight();
    }

    public static double calcAreaTriangle(Figure triangle){
        return triangle.getBase()*triangle.getHeight()/2;
    }
}
