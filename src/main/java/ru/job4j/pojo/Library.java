package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Война и мир", 600);
        Book book1 = new Book("Гарри Поттер и филосовский камень", 400);
        Book book2 = new Book("Clean code", 300);
        Book book3 = new Book("Грокаем алгоритмы", 200);
        book1.setName("Грокаем алгоритмы");
        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        Library.print(books);
        System.out.println("Меняем книги местами");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        Library.print(books);
        System.out.println("Только книга с именем \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean code")) {
                System.out.println("Книга " + b.getName() + " содержит " + b.getNumberPages() + " страниц");
            }
        }
    }

    public static void print(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println("Книга " + b.getName() + " содержит " + b.getNumberPages() + " страниц");
        }
    }
}
