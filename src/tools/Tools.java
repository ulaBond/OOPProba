package tools;

import myclasses.Author;
import myclasses.Book;

public class Tools {
    public Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    public Book createBook(String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}