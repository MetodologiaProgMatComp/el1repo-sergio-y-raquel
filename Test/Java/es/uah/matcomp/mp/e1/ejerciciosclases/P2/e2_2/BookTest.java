package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0);
        assertEquals(b1.getName(),"Libro 1");
    }

    @Test
    void getAuthor() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0);
        assertEquals(b1.getAuthor(),"[Les.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_2.Author;@664613");
    }

    @Test
    void getPrice() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0);
        assertEquals(b1.getPrice(),20);
    }

    @Test
    void setPrice() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0);
        b1.setPrice(25.2);
        assertEquals(b1.getPrice(),25.2);
    }

    @Test
    void getQty() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0,5);
        assertEquals(b1.getQty(),5);
    }

    @Test
    void setQty() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0,5);
        b1.setQty(10);
        assertEquals(b1.getQty(),10);
    }

    @Test
    void testToString() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0,5);
        assertEquals(b1.toString(),"Book{name=Libro 1, author=[Author{name= Felipe, email= feli@niidea.com, gender= m}, Author{name= Lorena, email= lore@niidea.com, gender= f}], price=20.0, qty=5}");
    }

    @Test
    void getAuthorNames() {
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authors = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authors, 20.0,5);
        assertEquals(b1.getAuthorNames(),"{Felipe}{Lorena}");
    }
}