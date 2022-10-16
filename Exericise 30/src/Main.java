import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        a = sc.nextInt();
        System.out.println("Input second number: ");
        b = sc.nextInt();
        System.out.println("Input third number: ");
        c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a == b || a == b || b == c) {
            System.out.println("Neither increasing or decreasing order!");
        } else {
            System.out.println("All numbers are different!");
        }
    }
}