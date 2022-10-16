import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        x = sc.nextInt();

        for(int i=0;i<x;i++){
            for(int j=0;j<=x-i;j++)
                System.out.print("_");
            for(int j=0;j<=i;j++){
                System.out.print("@ ");
            }
            System.out.println();
        }

    }
}