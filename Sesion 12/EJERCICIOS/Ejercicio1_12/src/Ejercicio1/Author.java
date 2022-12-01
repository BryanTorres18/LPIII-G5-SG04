package Ejercicio1;

public class Author {
    
    private int authorid;
    private String firstname;
    private String lastname;

    public Author(int authorid, String firstname, String lastname) {
        this.authorid = authorid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Author() {
    }

    public int getAuthorid() {
        return authorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
