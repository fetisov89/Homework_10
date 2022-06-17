package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Лев", "Толстой");
        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);
        book2.setYear(2015);
        System.out.println("book2.getYear() = " + book2.getYear());
        System.out.println(author1);
        System.out.println(book2);
    }
}
