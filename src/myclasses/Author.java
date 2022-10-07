
package myclasses;

public class Author {
    private String firstname;
    private String lastname;

    public Author() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Autor{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
    
}
