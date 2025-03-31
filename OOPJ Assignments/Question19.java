//use ternaory operator cheak character is uppercase ,lowercase and not a latter
class Question19{
	public static void main(String[] args){
		char ch = 'G';
		String result = (ch >= 'A' && ch <= 'Z')? "Uppercase" : (ch >= 'a' && ch <= 'z')? "Lowercase":"Not Character";
		System.out.print("Character :"+ ch + "is :" + result);
	}

}