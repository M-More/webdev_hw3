package com.baowei.webhw3;

public class Book {

    private final String name;
    private final String isbn;
    private final String author;
    private int storage;

    public Book(String name, String isbn, String author, int storage) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
