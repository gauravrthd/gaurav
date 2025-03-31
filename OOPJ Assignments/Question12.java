//multiple by 8 without using * 
import java.util.Scanner;
class Question12{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = myobj.nextInt();
		int b = a<<3;
		System.out.print(b);
	}

}