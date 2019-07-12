package collection.ComparableAndComparator;

public class Author implements Comparable<Author> {

    String firstname;
    String lastname;
    int autorage;

    public Author() {

    }

    public Author(String firstname, String lastname, int autorage) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.autorage = autorage;
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

    public int getAutorage() {
        return autorage;
    }

    public void setAutorage(int autorage) {
        this.autorage = autorage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", autorage=" + autorage +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.firstname.compareTo(o.firstname);
    }
}
