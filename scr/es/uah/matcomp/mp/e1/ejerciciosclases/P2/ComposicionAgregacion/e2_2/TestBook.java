package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_2;

public class TestBook {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);//toString()
        System.out.println(String.format("\nLos autores son: %s", javaDummy.getAuthorNames()));

        System.out.println();
        Author a1 = new Author("Felipe","feli@niidea.com",'m');
        Author a2 = new Author("Lorena","lore@niidea.com",'f' );
        Author[] authorss = new Author[]{a1,a2};
        Book b1 = new Book("Libro 1", authorss, 20.0);
        System.out.println(b1.getAuthorNames());
    }
}