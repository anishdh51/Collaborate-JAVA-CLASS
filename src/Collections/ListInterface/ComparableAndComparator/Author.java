package Collections.ListInterface.ComparableAndComparator;

public class Author implements Comparable<Author> {

     String firstname;
     String lastname;
     int authorage;


    public Author(String firstname, String lastname, int authorage) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.authorage = authorage;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAuthorage() {
        return authorage;
    }

    public void setAuthorage(int authorage) {
        this.authorage = authorage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", authorage=" + authorage +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.firstname.compareTo(o.firstname);

    }
}
