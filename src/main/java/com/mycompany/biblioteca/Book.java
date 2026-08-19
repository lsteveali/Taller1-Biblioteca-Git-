package com.mycompany.biblioteca;

public class Book extends Material {

    private String author;
    private boolean available;

    // Constructor
    public Book(String code, String title, int publicationYear, String author) {
        super(code, title, publicationYear);
        this.author = author;
        this.available = true;
    }

    // Getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + author + " | Disponible: " + (available ? "Sí" : "No");
    }
}