//implement calculator take 2 number and perform arithmatic operation using switch case
import java.util.Scanner;
class Question22{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the vale of a : ");
		int a = myobj.nextInt();
		System.out.print("Enter the value of b : ");
		int b = myobj.nextInt();
		System.out.print("Enter the arithmatic operator : ");
		char x = myobj.next().charAt(0);
		
		int result;
		switch(x){
			case ('+'):
				result=a+b;
				System.out.print("Addition is : "+result);
				break;
			case ('-'):
				result=a-b;
				System.out.print("Subtraction is : "+result);
				break;
			case ('*'):
				result=a*b;
				System.out.print("multiple is : "+result);
				break;
			case ('/'):
				result=a/b;
				System.out.print("divided is : "+result);
				break;
		}
		myobj.close();
		
	}
}