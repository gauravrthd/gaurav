import java.util.Scanner;
class Question7{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = myobj.nextInt();
        String a = ((year%4==0 && year%100!=0) || (year%400==0)) ? String.format("%d is leap year",year):String.format("%d is not leap year",year);
        System.out.print(a);
        myobj.close();
    }   
}