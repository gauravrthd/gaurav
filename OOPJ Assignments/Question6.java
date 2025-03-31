//use of ternory operator for find largest number
class Question6{
	
	public static void main(String [] args){
		
		int a=1,b=2,c=3;
		int largest_number= (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print("largest num is :"+ largest_number);
	
	}

}