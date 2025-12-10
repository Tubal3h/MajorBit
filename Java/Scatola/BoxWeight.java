public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(double height, double length, double depth, int weight) {
        super(height, length, depth);
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "Altezza: "+ getHeight() + ", Lunghezza: " + getLength() + ", Profondità: " + getDepth() + ", Peso: " + weight;
    }
}
