//without using third veriable swape the two num
class Question1{

	public static void main(String args[]){
		int a = 1;
		int b = 2;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
	
	}
}