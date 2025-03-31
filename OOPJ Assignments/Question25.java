//reverse of integer without using reverse function
import java.util.Scanner;
class Question25{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = myobj.nextInt();
		int new_num=0;
		int digit;
		int temp = a;
		
		while(temp>0){
			digit=temp%10;
			new_num = new_num*10 + digit;
			temp/=10;
			
		
		}
		System.out.print("reverse number is :"+new_num);
		
	}
	
}