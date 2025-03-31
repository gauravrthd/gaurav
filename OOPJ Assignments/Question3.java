//: Write a program that takes three boolean inputs and prints true if at least two of them are true
import java.util.Scanner;
class Question3{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        Boolean x = myobj.nextBoolean();
        Boolean y = myobj.nextBoolean();
        Boolean z = myobj.nextBoolean();
        Boolean a = x&&y||z;
        System.out.println(a);
    
}
}