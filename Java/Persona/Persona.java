

public class Persona {
    String name;
    String surname;
    String phone;
    String address;
    String city;

    public Persona(
            String name,
            String surname,
            String phone,
            String address,
            String city
        ){
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.address = address;
            this.city = city;
    }
    //metodi name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    //metodi surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //metodi phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //metodi address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //metodi city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
