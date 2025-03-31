import java.util.Scanner;

public class Question15 {
    public static int swapBits(int x) {
        int evenBits = (x & 0xAAAAAAAA) >> 1;
        int oddBits = (x & 0x55555555) << 1;
        return evenBits | oddBits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Number after swapping odd and even bits: " + swapBits(num));
    }
}
