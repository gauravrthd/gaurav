//given number positive,negative or zero 
import java.util.Scanner;
class Question16{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = myobj.nextInt();
		String b = (a==0)?String.format("Number is zero"):String.format((a>0?String.format("Number is positive"):String.format("Number is negative")));
		System.out.print(b);
	}
}