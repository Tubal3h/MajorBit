public abstract class Figure {
    protected double height, base;

    public Figure(
        double base,
        double height
    ){
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double calcArea();

}