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
            for (int j=1; j<=i; j++ )
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
