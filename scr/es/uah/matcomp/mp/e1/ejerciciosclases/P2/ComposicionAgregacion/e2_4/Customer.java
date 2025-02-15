package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    //////////////////////////////////////
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    //////////////////////////////////////

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString() {
        return String.format("%s(%s)(%s%s)",name,id,discount,"%");
    }
}
