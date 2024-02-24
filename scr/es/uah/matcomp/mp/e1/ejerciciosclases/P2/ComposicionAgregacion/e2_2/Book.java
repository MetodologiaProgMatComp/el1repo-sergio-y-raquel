package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_2;

import java.util.Arrays;

public class Book {
    String name;
    Author[] authors;
    Double price;
    int qty = 0;

    public Book(String n, Author[] a, Double p) {
        this.name = n;
        this.authors = a;
        this.price = p;
    }

    public Book(String n, Author[] a, Double p, int q) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String authorsToString() {
        int contador = 0;
        String autores = "[";
        int lenght = authors.length;
        while (contador < lenght) {
            String autor = authors[contador].toString();
            autores += "" + autor + ", ";
            contador++;
        }
        autores = autores.substring(0,autores.length()-2);
        autores += "]";
        return autores;
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
        return String.format("Book{name=%s, author=%s, price=%s, qty=%s}",name, Arrays.toString(authors),price,qty);
    }

    public String getAuthorNames() {
        int contador = 0;
        String nombres = "";
        int lenght = authors.length;
        while (contador < lenght) {
            String nombre = authors[contador].getName();
            nombres += "{" + nombre + "}";
            contador++;
        }
        return nombres;
    }
}
