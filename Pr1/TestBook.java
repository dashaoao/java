package Pr1;

import Pr1.Book;

public class TestBook {
    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book(2859);
        Book third = new Book("How to overcome addiction", 12 );
        first.setTitle("How to learn optimism");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
