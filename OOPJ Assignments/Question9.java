// wap to cheak unber is between 20 to 50 without using if elseimport
import java.util.Scanner;
class Question9{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the number :")
		int x = myobj.nextInt();
		String a = (x>20&&x<50)? String.format("%d is between 20 and 50",x): String.format("%d is not between 20 and 50",x);
		System.out.print(a);
		myobj.close();
	}
}