package com.company;

import java.util.Objects;

import static java.util.Objects.hash;

public class Book {
    private String bookName;
    private int publicationYear;
    Author author;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString (){
        return "Book name: "+this.bookName+". Author name: "+this.author+". Year publication: "+this.publicationYear;

    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.bookName);
    }
    public int hashCode(){
        return Objects.hash(bookName);
    }

}
