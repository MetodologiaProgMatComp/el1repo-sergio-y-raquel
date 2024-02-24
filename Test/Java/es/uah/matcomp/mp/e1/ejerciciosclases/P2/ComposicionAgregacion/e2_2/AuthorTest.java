package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_2;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author a1=new Author("Juan","juan@email", 'm');
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
    void getGender() {
        assertEquals(a1.getGender(),'m');
    }

    @Test
    void testToString() {
        Author a2 =new Author("Luisa","luisa@hotmail",'f');
        assertEquals(a2.toString(),"Author{name= Luisa, email= luisa@hotmail, gender= f}");
    }
}