public class Triangle extends Figure{
    public Triangle(
        double height,
        double base
    ){
        super(base, height);
    }

    @Override
    public double calcArea(){
        return base * height/2;
    }
}
