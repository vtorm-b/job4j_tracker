package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code");
        Book book1 = new Book("Java");
        Book book2 = new Book("Developments");
        Book[] tom = new Book[3];
        tom[0] = book;
        tom[1] = book1;
        tom[2] = book2;
        for (Book bk : tom) {
            System.out.println(bk.getName() + " - " + bk.getCount());
            Book tmp = tom[0];
            tom[0] = tom[2];
            tom[2] = tmp;
            System.out.println(tmp.getName());
        }
            for (int j = 0; j < tom.length; j++) {
                Book a = tom[j];
                if (j > 0) {
                    System.out.println("Книга: " + a.getName());
                }
            }
        }
    }


