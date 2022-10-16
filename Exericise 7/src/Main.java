import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int day;
       int year;
       String mothName="";
       int numberDay=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number: ");
        day = sc.nextInt();
        System.out.println("Input a year: ");
        year = sc.nextInt();

        switch (day){
            case 1:
                mothName = "January";
                numberDay = 31;
                break;
            case 2:
                if(year%4==0 && year%100!=0){
                    mothName = "February";
                    numberDay = 29;
                }else if(year%400==0){
                    mothName = "February";
                    numberDay = 29;
                }else{
                    mothName = "February";
                    numberDay = 28;
                }
                break;
            case 3:
                mothName = "March";
                numberDay = 31;
                break;
            case 4:
                mothName = "April";
                numberDay = 30;
                break;
            case 5:
                mothName = "May";
                numberDay = 31;
                break;
            case 6:
                mothName = "June";
                numberDay = 30;
                break;
            case 7:
                mothName = "July";
                numberDay = 31;
                break;
            case 8:
                mothName = "August";
                numberDay = 31;
                break;
            case 9:
                mothName = "September";
                numberDay = 30;
                break;
            case 10:
                mothName = "October";
                numberDay = 31;
                break;
            case 11:
                mothName = "November";
                numberDay = 30;
                break;
            case 12:
                mothName = "December";
                numberDay = 31;
                break;
            default:
                System.out.println("input wrong data!");
        }
        System.out.printf(mothName + " "+year+ " has "+numberDay+" days\n");
    }
}