import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        scanner.close();
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        ? "Vowel" 
                        : (Character.isLetter(ch) ? "Consonant" : "Not a letter");
        
        System.out.println(ch + " is a " + result);
    }
}
