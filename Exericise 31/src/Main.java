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

        if(a>b&&b>c){
            System.out.println("Decreasing order!");
        } else if (a<b&&b<c) {
            System.out.println("Increasing order!");
        }else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }
}