package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_3;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_3.Author;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_3.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        assertEquals(libro1.getIsbn(),"1000");
    }

    @Test
    void getName() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        assertEquals(libro1.getName(),"El Quijote");
    }

    @Test
    void getAuthor() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        assertEquals(libro1.getAuthor(),Cervantes);
    }

    @Test
    void getPrice() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        assertTrue(libro1.getPrice()==20.00);
    }

    @Test
    void setPrice() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        libro1.setPrice(25.00);
        assertEquals(libro1.getPrice(),25.00);
    }

    @Test
    void getQty() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00);
        libro1.setQty(10);
        assertEquals(libro1.getQty(),10);
    }

    @Test
    void setQty() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00,11);
        libro1.setQty(10);
        assertEquals(libro1.getQty(),10);
    }

    @Test
    void getAuthorName() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00,11);
        assertEquals(libro1.getAuthorName(),"Cervantes");
    }

    @Test
    void testToString() {
        Author Cervantes=new Author("Cervantes","cervantes@email.com");
        Book libro1=new Book("1000","El Quijote",Cervantes,20.00,11);
        assertEquals(libro1.toString(),"Book[isbn=1000, name=El Quijote, Author[name=Cervantes, email=cervantes@email.com], price=20.0, qty=11]");
    }
}