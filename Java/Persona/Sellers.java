

public class Sellers extends Employee{
    private double commissions;
    public Sellers(
            int idEmployee,
            String name,
            String surname,
            String phone,
            String address,
            String city,
            double salary,
            double commissions
        ) {
        super(idEmployee, name, surname, phone, address, city, salary);
        this.commissions = commissions;
    }

    //metodo commissions
    public double getCommissions() {
        return commissions;
    }

    public void setCommissions(double commissions) {
        this.commissions = commissions;
    }

    //class venditore.java
    @Override
    public double calcSalary() {
        return getSalary() + this.commissions;
    }

    @Override
    public String toString() {
        return "\n+======================================+\n" + 
            "|  Venditore                             \n" +
            "|  Id: " + getIdEmployee() + "\n" +
            "|  Nome: " + getName() + "\n" +
            "|  Cognome: " + getSurname() + "\n" +
            "|  Salario: " + String.format("%.2f", getSalary()) + "\n" +
            "|  Di cui provvigioni: " + String.format("%.2f", getCommissions()) + "\n" +
            "|  Tot: " + String.format("%.2f", calcSalary()) + "\n" +
            "+======================================+";
    }

    @Override
    public void getAllData() {
        String bordo = "+--------------------------------------------------+";
        
        // Intestazione con Nome e Cognome in Maiuscolo
        System.out.println("\n" + bordo);
        System.out.printf("| Matricola: %-37s |\n", getIdEmployee());
        System.out.printf("| Venditore: %-37s |\n", (getName() + " " + getSurname()).toUpperCase());
        System.out.println(bordo);

        // Sezione Dati Personali
        System.out.printf("| %-12s %-34s |\n", "Telefono:", getPhone());
        System.out.printf("| %-12s %-34s |\n", "Città:", getCity());
        System.out.printf("| %-12s %-34s |\n", "Indirizzo:", getAddress());
        
        System.out.println(bordo);
        
        // Sezione Stipendio e provvigioni
        System.out.println("| Stipendio:                                  |");
        System.out.printf("| %-20s %5.2f                      |\n", "- Salario:", getSalary());
        System.out.printf("| %-20s %5.2f                      |\n", "- Provvigioni:", this.commissions);

        
        // Sezione Media Finale
        System.out.println("|                                                  |");
        System.out.printf("| %-20s %5.2f                      |\n", "TOT:", calcSalary());
        System.out.println(bordo + "\n");
    }
}
