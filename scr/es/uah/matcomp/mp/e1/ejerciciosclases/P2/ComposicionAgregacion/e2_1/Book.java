package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_1;

public class Book {
    String name;
    Author author;
    Double price;
    int qty = 0;

    public Book(String n, Author a, Double p) {
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public Book(String n, Author a, Double p, int q) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book{name= " + name + ", author= " + author + ", price= " + price + ", qty= " + qty + "}";
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }
}
