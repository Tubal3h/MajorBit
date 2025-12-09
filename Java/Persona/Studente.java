package Persona;

public class Studente extends Persona{
    double physics;
    double math;
    double informatic;
    double story;
    public Studente(
            String name,
            String surname,
            String phone,
            String address,
            String city,
            double physics,
            double math,
            double informatic,
            double story
        ){
        super(name, surname, phone, address, city);
        this.physics = physics;
        this.math = math;
        this.informatic = informatic;
        this.story = story;
    }

    //metodo physics
    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    //metodo math
    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    //metodo informatic
    public double getInformatic() {
        return informatic;
    }
    public void setInformatic(double informatic) {
        this.informatic = informatic;
    }

    //metodo story
    public double getStory() {
        return story;
    }

    public void setStory(double story) {
        this.story = story;
    }

    public double getAverage() {
        return (this.physics +  this.math + this.informatic + this.story) / 4;
    }

    @Override
    public String toString() {
        return "\n+======================================+\n" + 
            "|  " + getName() + " " + getSurname() + "\n" +
            "|  Media: " + String.format("%.2f", getAverage()) + "\n" +
            "+======================================+";
    }

    public void getAllData() {
        String bordo = "+--------------------------------------------------+";
        
        // Intestazione con Nome e Cognome in Maiuscolo
        System.out.println("\n" + bordo);
        System.out.printf("| STUDENTE: %-37s |\n", (getName() + " " + getSurname()).toUpperCase());
        System.out.println(bordo);

        // Sezione Dati Personali
        System.out.printf("| %-12s %-34s |\n", "Telefono:", getPhone());
        System.out.printf("| %-12s %-34s |\n", "Città:", getCity());
        System.out.printf("| %-12s %-34s |\n", "Indirizzo:", getAddress());
        
        System.out.println(bordo);
        
        // Sezione Voti
        System.out.println("| VOTI RIPORTATI:                                  |");
        System.out.printf("| %-20s %5.1f                      |\n", "- Fisica", this.physics);
        System.out.printf("| %-20s %5.1f                      |\n", "- Matematica", this.math);
        System.out.printf("| %-20s %5.1f                      |\n", "- Informatica", this.informatic);
        System.out.printf("| %-20s %5.1f                      |\n", "- Storia", this.story);
        
        // Sezione Media Finale
        System.out.println("|                                                  |");
        System.out.printf("| %-20s %5.2f                      |\n", "MEDIA FINALE:", getAverage());
        System.out.println(bordo + "\n");
    }
}
