package tools;

import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;










public class Tools {
    
    Scanner scanner = new Scanner(System.in);
    
    public Author[] createAuthors(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for (int i = 0; i < countAuthorsInBook; i++) {
            System.out.println("Имя автора"+(i+1)+": ");
            String firstname = scanner.nextLine();
            System.out.println("Фамилия автора"+(i+1)+": ");
            String lastname = scanner.nextLine();
            Author author = new Author();
            author.setFirstname(firstname);
            author.setLastname(lastname);
            authors[i] = author;
        }
        return authors;
    }
    public Book createBook(){
        Book book = new Book();
        System.out.println("Название книги");
        book.setTitle(scanner.nextLine());
        System.out.println("Сколько авторов: ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthors(countAuthorsInBook));
        return book;
    }

}