package Pr2;

import Pr2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author first = new Author("Ivan Popov", "iv.Popov@somewhere.com", 'M');
        Author second = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');
        second.setEmail("AnIv@somewhere.com");
        System.out.println(first);
        System.out.println(second);
    }
}
