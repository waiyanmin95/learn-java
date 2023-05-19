package PPL.models;

import java.time.LocalDate;

public class Person {
    private String fname;
    private String lname;
    private LocalDate dob;
    private Address address;

    private Person spouse;

    private Pet pet;

    public Person(String fname, String lname, LocalDate dob) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + fname + '\'' +
                ", LastName='" + lname + '\'' +
                ", D.O.B=" + dob +
                ", Address=" + address +
                ", Spouse=" + spouse +
                ", Pet=" + pet +
                '}';
    }
}
