package com.example.kiemtra1910;

public class Book {

    int id_book;
    String title;
    String author;

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id_book, String title, String author) {
        this.id_book = id_book;
        this.title = title;
        this.author = author;
    }
    public Book(){
        this.id_book=0;
        this.title=null;
        this.author=null;

    }




}

