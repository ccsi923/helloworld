import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> ccys = new HashMap<String, Double>();
        ccys.put("USD", 1.01);
        ccys.put("COP", 4506.14);
        ccys.put("CHF", 0.97);
        ccys.put("GBP", 0.84);
        ccys.put("MXN", 20.70);
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the EUR amount:");
        double eur = sc.nextInt();
        System.out.println("Write the CCY to convert");
        String ccy = sc.next();

        if (ccys.get(ccy) != null)
        {
            double convertValue = ccys.get(ccy);
            double convert = eur * convertValue;
            System.out.println("EUR: " + eur + " are " + convert + " " + ccy);

        } else
        {
            System.out.println("There is not ccy " + ccy + " on the system");
        }
    }
}
