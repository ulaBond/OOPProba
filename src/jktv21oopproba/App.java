
package jktv21oopproba;

import myclasses.Author;
import myclasses.Book;

public class App {
    public void run(){
//        Book book = new Book();
//        book.setTitle("Learning JAVA");
//        book.addAuthor(createAuthor("Antonio", "Gonsales"));
        Book book = createBook("KOOOO");
        book.addAuthor(createAuthor("Ivan", "Ivanov"));
        System.out.println(book.toString());
    }
    private Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    private Book createBook(String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}


