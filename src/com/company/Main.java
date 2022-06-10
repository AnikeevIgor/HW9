package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Nikolay", "Gogol");
        Author author2 = new Author("Fedor", "Dostoevsky");
        Book book1 = new Book("dead Souls", author1, 1842);
        Book book2 = new Book("Crime and Punishment", author2, 1866);
        book1.setPublicationYear(2007);
        System.out.println(book1.getPublicationYear());
    }
}
