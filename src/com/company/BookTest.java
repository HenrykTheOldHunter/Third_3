package com.company;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите автора книги: ");
        book.setAuthor(in.nextLine());

        System.out.println("Введите кол-во страниц: ");
        book.setPage(in.nextInt());

        System.out.println("Введите длину: ");
        book.setLength(in.nextInt());

        System.out.println("Введите вес: ");
        book.setWeight(in.nextInt());

        System.out.println("Введите год написания: ");
        book.setAge(in.nextInt());

        System.out.println(book.getAuthor() + " " + book.getPage() + " " + book.getLength() + " " + book.getWeight() + " " + book.getAge());
    }
}

