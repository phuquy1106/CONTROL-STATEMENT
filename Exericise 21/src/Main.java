import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        x = sc.nextInt();
        for (int i=1; i<=x; i++)
        {
            for (int j=1; j<=x-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=x-1; i>=1; i--)
        {
            for(int j = 1; j <= x - i; j++) {
                System.out.print("_");
            }
            for(int j=i; j <=  2*i - 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
