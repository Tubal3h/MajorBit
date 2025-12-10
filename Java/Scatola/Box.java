
class Box {
    private double height;
    private double length;
    private double depth;

    public Box(double height, double length, double depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
	
	public double calculateVolume(double height, double length, double depth){
		return getDepth() * getLength() * getDepth();
	}
	
	public double sumBoxSizes(double height, double length, double depth){
		return getDepth() + getLength() + getDepth();
	}

    @Override
    public String toString(){
        return "Altezza: "+ height + ", Lunghezza: " + length + ", Profondità: " + depth;
    }
	
}


