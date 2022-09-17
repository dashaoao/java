package Pr5;

import java.util.Scanner;

public class Rec11 {
    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        if (n == 0) {
            int m = in.nextInt();
            in.nextLine();
            if (m == 0) {
                return 0;
            } else if (m == 1) {
                    return recursion() + m;
                }
            else {
                return recursion();
            }
        } else if (n == 1)
            return recursion() + n;
        else
            return recursion();
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
