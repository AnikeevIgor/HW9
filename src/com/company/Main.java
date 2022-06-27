package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Nikolay", "Gogol");
        Author author2 = new Author("Fedor", "Dostoevsky");
        Book book1 = new Book("dead Souls", author1, 1842);
        Book book2 = new Book("dead Souls", author2, 1866);
        book1.setPublicationYear(2007);
        System.out.println(book1.getPublicationYear());
        System.out.println(author1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
