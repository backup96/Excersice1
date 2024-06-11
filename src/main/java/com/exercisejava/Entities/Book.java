package com.exercisejava.Entities;

public class Book {
    public String Title;
    public String author;
    public Long ISBN;
    public int year;
    public String estado;

    public Book(String title, String author, Long iSBN, int year) {
        this.Title = title;
        this.author = author;
        this.ISBN = iSBN;
        this.year = year;
        this.estado = "Disponible";
    }

    public String getBook() {
        return "Libros \n"
                + "Titulo: " + Title + "\n"
                + "Autor: " + author + "\n"
                + "ISBN: " + this.ISBN + "\n"
                + "Año de publicación: " + this.year + "\n"
                + "Estado: " + this.estado + "\n";
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return author;
    }

    public void setEstadoPres(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void getSpecificBook(String Title) {
        System.out.println("Libros \n"
                + "Titulo: " + this.Title + "\n"
                + "Autor: " + this.author + "\n"
                + "ISBN: " + this.ISBN + "\n"
                + "Año de publicación: " + this.year + "\n"
                + "Estado: " + this.estado + "\n");
    }
}
