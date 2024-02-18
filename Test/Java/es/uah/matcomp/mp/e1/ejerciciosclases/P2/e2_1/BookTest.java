package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author Kafka = new Author("Kafka","kafka@email",'m');
    Author Cervantes = new Author("Cervantes","cervantes@hotmail",'m');
    Book lib1 = new Book("Metamorfosis",Kafka,10.50,30);
    Book lib2 = new Book("Quijote",Cervantes,15.90);

    @Test
    void getName() {
        assertEquals(lib1.getName(),"Metamorfosis");
    }

    @Test
    void getAuthor() {
        assertEquals(lib1.getAuthor(),Kafka);
    }

    @Test
    void getPrice() {
        assertEquals(lib2.getPrice(),15.90);
    }

    @Test
    void setPrice() {
        lib2.setPrice(17.00);
        assertEquals(lib2.getPrice(),17.00);
    }

    @Test
    void getQty() {
        assertEquals(lib2.getQty(),0);
    }

    @Test
    void setQty() {
        lib2.setQty(10);
        assertEquals(lib2.getQty(),10);
    }

    @Test
    void testToString() {
        assertEquals(lib1.toString(),"Book{name= Metamorfosis, author= Author{name= Kafka, email= kafka@email, gender= m}, price= 10.5, qty= 30}");
    }

    @Test
    void getAuthorName() {
        assertEquals(lib2.getAuthorName(),"Cervantes");
        assertEquals(lib2.getAuthorName(),lib2.getAuthor().getName());
    }

    @Test
    void getAuthorEmail() {
        assertEquals(lib1.getAuthorEmail(),lib1.getAuthor().getEmail());
        assertEquals(lib1.getAuthorEmail(),"kafka@email");
    }

    @Test
    void getAuthorGender() {
        assertEquals(lib2.getAuthorGender(),'m');
        assertEquals(lib2.getAuthorGender(),lib2.getAuthor().getGender());
    }
}