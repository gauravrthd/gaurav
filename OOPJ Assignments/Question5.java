// swap two intiger using -= and += operator
class Question5{
	public static void main (String args[]){
		int a = 100;
		int b = 200;
		a+=b;
		b=a-b;
		a-=b;
		System.out.println(a);
		System.out.println(b);
	}	

}