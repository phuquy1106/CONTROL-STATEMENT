import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        x = sc.nextInt();

        for(int i=x;i>0;i--){
            for(int j=0;j<=x-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}