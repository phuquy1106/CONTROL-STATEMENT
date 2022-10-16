import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            for(int j=0;j<=i;j++){
                if (j==0||i==0)
                    k =1;
                else
                    k=k*(i-j+1)/j;
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}