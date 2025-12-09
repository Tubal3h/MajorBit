
public class Utils {
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
	Index index = new Index();
	int data = 0;
	
    public double average(Box box) {
        return (box.getHeight() + box.getLength() + box.getDepth()) / 3.0;
    }
	
	public double  greaterVolume(double arr[]){
		double greater = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > greater) {  // Confronta con 'greater', non con altri elementi
				greater = arr[i];
				index.setIndex(i+1);
				data = index.getIndex();
				System.out.println(data);
				System.out.println(i);
			}
		}
		return greater;
	}
	
	public int getData(){
		return this.data;
	}
	
}