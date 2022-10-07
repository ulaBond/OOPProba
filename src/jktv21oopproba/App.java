
package jktv21oopproba;

import myclasses.Book;
import tools.Tools;

public class App {
    public void run(){
//        Book book = new Book();
//        book.setTitle("Learning JAVA");
//        book.addAuthor(createAuthor("Antonio", "Gonsales"));
        Tools tools = new Tools();
        Book book = tools.createBook("KOOOO");
        book.addAuthor(tools.createAuthor("Ivan", "Ivanov"));
        System.out.println(book.toString());
    }
}