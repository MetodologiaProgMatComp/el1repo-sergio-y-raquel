package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_6;

public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Gato");
        cat1.greets();
        Dog dog1 = new Dog("Perro");
        dog1.greets();
        BigDog bigDog1 = new BigDog("PerroGrande");
        bigDog1.greets();
// Using Polymorphism
        Animal animal1 = new Cat("Gato2");
        animal1.greets();
        Animal animal2 = new Dog("Perro2");
        animal2.greets();
        Animal animal3 = new BigDog("PerroGrande2");
        animal3.greets();
        //Animal animal4 = new Animal();
// Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        // ERROR A PROPÓSITO    Cat cat2 = (Cat)animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
