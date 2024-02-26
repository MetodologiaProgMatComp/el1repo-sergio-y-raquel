package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        assertEquals("Mathematics", s1.getProgram());
    }

    @Test
    void setProgram() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        s1.setProgram("Literature");
        assertEquals("Literature", s1.getProgram());
    }

    @Test
    void getYear() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        assertEquals(2000, s1.getYear());
    }

    @Test
    void setYear() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        s1.setYear(2005);
        assertEquals(2005, s1.getYear());
    }

    @Test
    void getFee() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        assertEquals(400.0, s1.getFee());
    }

    @Test
    void setFee() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        s1.setFee(500.0);
        assertEquals(500.0, s1.getFee());
    }

    @Test
    void testToString() {
        Student s1= new Student("Jose", "Calle pio", "Mathematics", 2000, 400.0);
        assertEquals("Student[Person[name= Jose, address= Calle pio], program= Mathematics, year= 2000, fee= 400.0]",s1.toString());
    }
}