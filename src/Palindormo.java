import java.util.HashMap;
import java.util.Scanner;

public class Palindormo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the word");
        String original = sc.nextLine();
        String reverse = "";
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered value is a palindrome.");
        else
            System.out.println("Entered value isn't a palindrome.");
    }
}
