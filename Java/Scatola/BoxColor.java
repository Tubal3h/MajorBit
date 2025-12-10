public class BoxColor extends BoxWeight {
    private String color;

    public BoxColor(double height, double length, double depth, int weight, String color) {
        super(height, length, depth,weight);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Altezza: "+ getHeight() + ", Lunghezza: " + getLength() + ", Profondità: " + getDepth() + ", Peso: " + getWeight() + " e colore: " + color;
    }
}
