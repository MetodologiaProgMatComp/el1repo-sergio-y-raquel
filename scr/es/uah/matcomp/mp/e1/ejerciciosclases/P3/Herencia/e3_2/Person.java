package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_2;

public class Person {
    String name;
    String address;

    /////////////
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    /////////////

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Person[name= "+name+", address= "+address+"]";
    }
}
