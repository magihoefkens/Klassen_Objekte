package org.example;

public class Book {
    public String title;
    public String author;
    public String isbn;

    public Book(String titel,String author,String isbn){
        this.title=titel;
        this.author=author;
        this.isbn=isbn;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title  + ", author=" + author  + ", isbn=" + isbn+"}";
    }
}
