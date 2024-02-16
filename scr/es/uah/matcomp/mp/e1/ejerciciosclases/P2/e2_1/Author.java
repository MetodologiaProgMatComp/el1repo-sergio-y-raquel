package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_1;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String n, String e, char g) {
        this.gender = g;
        this.email = e;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
