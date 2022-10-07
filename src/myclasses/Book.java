package myclasses;
import java.util.Arrays;

public class Book {
    private Author[] authors;
    private String title;

    public Book() {
        authors = new Author[0];
    }

    public Author[] getAutors() {
        return authors;
    }

    public void setAutors(Author[] authors) {
        this.authors = authors;
    }
    public void addAuthor(Author author){
        //создаем копию authors с дополнительной ячейкой
        //в доп.ячейку помещаем author
        //в authors кладем ссылку на новый массив
        Author[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors [newAuthors.length-1] = author;
        this.authors = newAuthors;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{"
                + "autors=" 
                + Arrays.toString(getAutors()) 
                + ", title=" + getTitle()
                + '}';
    }
}