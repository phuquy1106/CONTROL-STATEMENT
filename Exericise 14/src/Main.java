import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated) : Input number of terms : ");
        x = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x+" x "+i+" = "+(x*i));
            if(i==x){
                break;
            }
        }
    }
}