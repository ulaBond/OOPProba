






package jktv21oopproba;

import java.util.Arrays;
import java.util.Scanner;
import myclasses.Book;
import tools.Tools;

public class App {
    public void run(){
//        Book book = new Book();
//        book.setTitle("Learning JAVA");
//        book.addAuthor(createAuthor("Antonio", "Gonsales"));
        Scanner scanner = new Scanner(System.in);
        Tools tools = new Tools();
        Book book = tools.createBook("KOOOO");
        book.addAuthor(tools.createAuthor("Ivan", "Ivanov"));
        System.out.println(book.toString());
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Название книги"+(i+1)+": ");
            String title = scanner.nextLine();
            book = new Book();
            book.setTitle(title);
            System.out.println("Сколько авторов: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < countAuthorsInBook; j++) {
                System.out.println("Имя автора"+(j+1)+": ");
                String firstname = scanner.nextLine();
                System.out.println("Фамилия автора"+(j+1)+": ");
                String lastname = scanner.nextLine();
                book.addAuthor(tools.createAuthor(firstname, lastname));
            }
            
            books[i] = book;
        }
        System.out.println(Arrays.toString(books));
    }
}