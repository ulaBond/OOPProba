/* */
package jktv21oopproba;

import java.util.Arrays;
import myclasses.Author;
import myclasses.Book;
/* * @author pupil */
public class JKTV21OOPProba {
    /* @param args the command line arguments*/
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
//        /*First autor and book */
//        Author author1 = new Author();
//        author1.setFirstname("Lev");
//        author1.setLastname("Tolstoy");
//        //Author[] authors1 = new Author[1];
//        //authors1[0] = author1;
//        Book book1 = new Book();
//        book1.setTitle("Voina i mir");
//        book1.addAuthor(author1);// add author to array
//        System.out.println(book1.toString());// вывод с помощью set используя метод toString
//        System.out.printf("Book{authors = %s, title = %s}"// вывод с помощью get
//                ,Arrays.toString(book1.getAutors()),book1.getTitle());
//        /*Second and third autors and second book */
//        Author author2 = new Author();
//        author2.setFirstname("Ilija");
//        author2.setLastname("Ilf");
//        Author author3 = new Author();
//        author3.setFirstname("Jevgeniy");
//        author3.setLastname("Petrov");
//        // 1 variant
//        //Author[] authors2 = new Author[2];
//        //authors2[0] = author2;
//        //authors2[1] = author3;
//        Book book2 = new Book();
//        book2.setTitle("12 stuliev");
//        // 2 variant
//        book2.addAuthor(author2);
//        book2.addAuthor(author3);
//        System.out.println(book2.toString());
//        
//        Book book3 = new Book();
//        book3.setTitle("Learning JAVA");
//        book3.addAuthor(createAuthor("Antonio", "Gonsales"));
//        System.out.println(book3.toString());
//    }
//    public static Author createAuthor(String firstname, String lastname){
//        Author author = new Author();
//        author.setFirstname(firstname);
//        author.setLastname(lastname);
//        return author;
//    }