package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_3;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_3.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author a1=new Author("Juan","juan@email");
    @Test
    void getName() {
        assertEquals(a1.getName(),"Juan");
    }

    @Test
    void getEmail() {
        assertEquals(a1.getEmail(),"juan@email");
    }

    @Test
    void setEmail() {
        a1.setEmail("juan@hotmail");
        assertEquals(a1.getEmail(),"juan@hotmail");
    }


    @Test
    void testToString() {
        Author a2 =new Author("Luisa","luisa@hotmail");
        assertEquals(a2.toString(),"Author[name=Luisa, email=luisa@hotmail]");
    }
}