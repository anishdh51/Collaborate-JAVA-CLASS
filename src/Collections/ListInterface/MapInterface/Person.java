package Collections.ListInterface.MapInterface;

import java.util.Date;

public class Person {


    public Person() {



    }

    private Long personID;
    private String Name;
    private Date PersonDOB;
    private String Address;



    public Person(Long personID, String name, Date personDOB, String address) {
        this.personID = personID;
        Name = name;
        PersonDOB = personDOB;
        Address = address;
    }

    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getPersonDOB() {
        return PersonDOB;
    }

    public void setPersonDOB(Date personDOB) {
        PersonDOB = personDOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", Name='" + Name + '\'' +
                ", PersonDOB=" + PersonDOB +
                ", Address='" + Address + '\'' +
                '}';
    }

    public void setPersonDOB() {
    }
}
