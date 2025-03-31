//find minimun number
import java.util.Scanner;
class Question17{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the First number :");
		int a = myobj.nextInt();
		System.out.print("Enter the Second number :");
		int b = myobj.nextInt();
		System.out.print("Enter the Third number :");
		int c = myobj.nextInt();
		System.out.print("Enter the Forth number :");
		int d = myobj.nextInt();
		String min_num=(a<b&a<c&a<d)?String.format("%d is min. number.",a):((b<c&b<d)?String.format("%d is min. number",b):(c<d? String.format("%d is min. number",c):String.format("%d is min. number.",d)) );
		System.out.print(min_num);
		myobj.close();
	
	}
}