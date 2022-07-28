import java.util.Scanner;

public class Tributo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write the your age");
        int age = sc.nextInt();
        if (age < 16)
            System.out.println("You don't have to pay any tax.");
        else
        {
            System.out.println("Please, write your salary");
            double salary = sc.nextDouble();
            if(salary >= 1000.0)
                System.out.println("You have to pay taxes.");
            else
                System.out.println("You don't have to pay any tax.");
        }
    }
}
