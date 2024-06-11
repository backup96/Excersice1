package com.exercisejava;

import com.exercisejava.Entities.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        Scanner varScanner = new Scanner(System.in);
        Scanner varTitle = new Scanner(System.in);
        Scanner varAuthor = new Scanner(System.in);
        Scanner varISBN = new Scanner(System.in);
        Scanner varYear = new Scanner(System.in);
        Scanner varSer = new Scanner(System.in);
        List<Book> Books = new ArrayList<>();
        while (x != 0) {
            System.out.println("Bienvenido" + "\n"
                    + "Para bucar un libro en específico --> 1" + "\n"
                    + "Para mostrar todos los libros --> 2" + "\n"
                    + "Para agregar un libro --> 3" + "\n"
                    + "Para prestar un libro --> 4" + "\n"
                    + "Para devolver un libro --> 5" + "\n"
                    + "Para salir --> 0" + "\n");
            x = varScanner.nextInt();
            if (x == 3) {
                System.out.println("Ingrese tiulo: " + "\n");
                String Title = varTitle.nextLine();
                System.out.println("Ingrese autor: " + "\n");
                String Author = varAuthor.nextLine();
                System.out.println("Ingrese ISBN: " + "\n");
                Long ISBN = Long.parseLong(varISBN.nextLine());
                System.out.println("Ingrese año de publicación: " + "\n");
                int Year = Integer.parseInt(varYear.nextLine());
                Book lib1 = new Book(Title, Author, ISBN, Year);
                Books.add(lib1);
            } else if (x == 1) {
                System.out.println("Ingrese un titulo o autor: ");
                String Ser = varSer.nextLine();
                for (Book r : Books) {
                    if ((r.getTitle().equals(Ser)) || (r.getAuthor().equals(Ser))) {
                        System.out.println(r.getBook());
                    }
                }
            } else if (x == 2) {
                for (Book r : Books) {
                    System.out.println(r.getBook());
                }
            } else if (x == 4) {
                System.out.println("Ingrese el titulo del libro: ");
                String Title = varTitle.nextLine();
                for (Book r : Books) {
                    if (r.getTitle().equals(Title)) {
                        if (r.getEstado().equals("Disponible")) {
                            r.setEstadoPres("Prestado");
                        } else {
                            System.out.println("El libro ya esta prestado");
                        }
                    }
                }
            } else if (x == 5) {
                System.out.println("Ingrese el titulo del libro: ");
                String Title = varTitle.nextLine();
                for (Book r : Books) {
                    if (r.getTitle().equals(Title)) {
                        if (r.getEstado().equals("Prestado")) {
                            r.setEstadoPres("Disponible");
                        } else {
                            System.out.println("El libro ya esta devuelto");
                        }
                    }
                }
            }
        }

    }
}
