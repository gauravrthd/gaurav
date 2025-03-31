//even & odd us ewith bitwise operator
import java.util.Scanner;
class Question23{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		int a = myobj.nextInt();
		String result = (a & 1) ==0? "Even":"Odd";
		System.out.print(result);
		
		
	}
}