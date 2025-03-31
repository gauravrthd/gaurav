//increament num without using ++
import java.util.Scanner;
class Question21{
	public static void main(String[] args){
		 Scanner myobj = new Scanner(System.in);
		 
		 int a = myobj.nextInt();
		 System.out.print("Enter the number :");
		 int b = -(~a);
		 System.out.print(b);
	
	}
}