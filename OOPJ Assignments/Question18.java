//print pass if mark 40 above and lower than 40 print fail using ternary  operator
import java.util.Scanner;
class Question18{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the percantage :");
		int marks = myobj.nextInt();
		String res = (marks>40)? String.format("PASS"):String.format("FAIL");
		System.out.print(res);
		myobj.close();
		
	}
} 