

public class Employee extends Persona{
    private int idEmployee;
    private double salary;
    private double bonus;

    public Employee(
            int idEmployee,
            String name,
            String surname,
            String phone,
            String address,
            String city,
            double salary
        ){
        super(name, surname, phone, address, city);
        this.salary = salary;
        this.idEmployee = idEmployee;
    }

    public Employee(
            int idEmployee,
            String name,
            String surname,
            String phone,
            String address,
            String city,
            double salary, 
            double bonus
        ){
        super(name, surname, phone, address, city);
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.bonus = bonus;
    }
    

    //metodi salary
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //metodi bonus
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //class impiegato.java
    public double  calcSalary(){
        return this.salary + this.bonus;
    }

    //metodo idEmployee;
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
    
    @Override
    public String toString() {
        return "\n+======================================+\n" + 
            "|  Impiegato                             \n" +
            "|  Matricola: " + getIdEmployee() + "\n" +
            "|  Nome: " + getName() + "\n" +
            "|  Cognome: " + getSurname() + "\n" +
            "|  Salario: " + String.format("%.2f", getSalary()) + "\n" +
            "|  Di cui superminimo: " + String.format("%.2f", getBonus()) + "\n" +
            "|  Tot: " + String.format("%.2f", calcSalary()) + "\n" +
            "+======================================+";
    }

    public void getAllData() {
        String bordo = "+--------------------------------------------------+";
        
        // Intestazione con Nome e Cognome in Maiuscolo
        System.out.println("\n" + bordo);
        System.out.printf("| Matricola: %-37s |\n", getIdEmployee());
        System.out.printf("| Impiegato: %-37s |\n", (getName() + " " + getSurname()).toUpperCase());
        System.out.println(bordo);

        // Sezione Dati Personali
        System.out.printf("| %-12s %-34s |\n", "Telefono:", getPhone());
        System.out.printf("| %-12s %-34s |\n", "Città:", getCity());
        System.out.printf("| %-12s %-34s |\n", "Indirizzo:", getAddress());
        
        System.out.println(bordo);
        
        // Sezione Stipendio e superminimo
        System.out.println("| Stipendio:                                  |");
        System.out.printf("| %-20s %5.2f                      |\n", "- Salario:", this.salary);
        System.out.printf("| %-20s %5.2f                      |\n", "- Superminimo:", this.bonus);

        
        // Sezione Totale
        System.out.println("|                                                  |");
        System.out.printf("| %-20s %5.2f                      |\n", "TOT:", calcSalary());
        System.out.println(bordo + "\n");
    }

}
