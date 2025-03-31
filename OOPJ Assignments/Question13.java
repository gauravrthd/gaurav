import java.util.Scanner;

public Question13{
    public static int absoluteValue(int num) {
        int mask = num >> 31;
        return (num + mask) ^ mask;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Absolute value of " + num + " is: " + absoluteValue(num));
    }
}
