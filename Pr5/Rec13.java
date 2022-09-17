package Pr5;

import java.util.Scanner;

public class Rec13 {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        if (n > 0) {
            System.out.println(n);
            int m = in.nextInt();
            in.nextLine();
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}