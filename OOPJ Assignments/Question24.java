//all even number between 1 to 100, using for loop
import java.util.Scanner;
class Question24{
	public static void main(String[] args){
		int i;
		for(i=1;i<=100;i++){
			if ((i&1) ==0){
				System.out.println("Even : "+i);
				}
		
		}
		
		
		
	}
}