package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_6;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Josefa");
        Mammal m1 = new Mammal("Miguel");
        Cat c1 = new Cat("Michi)");
        Dog d1 = new Dog("Bruno");
        Dog d2 = new Dog("Duna");

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(c1);
        c1.greets();
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
