






package jktv21oopproba;

import java.util.Arrays;
import myclasses.Book;
import tools.Tools;

public class App {
    public void run(){
        Tools tools = new Tools();
        Book[] books = new Book[2];  
        for (int i = 0; i < 2; i++) {            
            books[i] = tools.createBook();
        }
        System.out.println(Arrays.toString(books));
        for (int i = 0; i < 5; i++) {            
            System.out.printf("Book{%n\t%s%n\tAuthors=[%s]%n}", books[i].getTitle(), Arrays.toString(books[i].getAutors()));
        }
    }
}