package couser;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println("Higher = " + a);
            } else if (b > c) {
                System.out.println("Higher = " + b);
            } else {
                System.out.println("Higher = " + c);
            }
        }
    }
}