
public class Rectangle extends Figure{
    public Rectangle(
        double height,
        double base
    ){
        super(base, height);
    }

    @Override
    public double calcArea(){
        return base * height;
    }
}
