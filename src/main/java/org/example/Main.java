package org.example;

import java.lang.reflect.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto mariannasAuto = new Auto();
        Auto korisAuto = new Auto(600);
        System.out.println("Koris Auto Gesschwindigkeit " + korisAuto.geschwindigkeit);
        int beschleunigung = 30;
        korisAuto.incrementGeschwindigkeit(beschleunigung);
        System.out.println("Koris Auto wurde beschleunigt " + korisAuto.geschwindigkeit);
        Person sebastian = new Person("Sebastian", "männlich", 20);
        Person kori = new Person("Kori", "männlich", 20);
        Person marianna = new Person("Magi", "weiblich", 20);
        System.out.println("Sebastians Vorstellung: " + sebastian.vorstellung());
        System.out.println("Koris Vorstellung:" + kori.vorstellung());
        System.out.println("Mariannas Vorstellung: " + marianna.vorstellung());
        Book buch=new Book("Catch22","John Heller","789-1234567");
        Book buch1=new Book("Titel1","Author1","123-1234");
        Book buch2=new Book("Titel2","Author2","3435-33453");
        Book[] books={buch1,buch2};
        System.out.println("buch "+buch.toString());
        Library bibliothek=new Library(books);
        System.out.println("Meine Bibliothek: "+bibliothek.toString());
        System.out.println("Author erstes Buch: "+bibliothek.getBooks()[0].author);

    }


}