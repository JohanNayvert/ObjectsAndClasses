package com.skyeng;

public class Main {
    public static void main(String[] args) {
        System.out.println("ObjectsAndClasses");
        System.out.println();

        Book warAndPeace = new Book("Война и Мир", 1958);
        Book idiot = new Book("Идиот", 1983);
        Author tolstoy = new Author("Лев Толстой");
        Author dostoevsky = new Author("Федер Достоевский");

        warAndPeace.setYear(1999);

        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        System.out.println("idiot.getNameBook() = " + idiot.getNameBook());
        System.out.println("dostoevsky.getNameAuthor() = " + dostoevsky.getNameAuthor());

        System.out.println();
        System.out.println("HomeWork Complete");
    }
}
