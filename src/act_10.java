import java.util.Scanner;
public class act_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Money Deposit: ");
        double pval = in.nextInt();

        System.out.print("Enter the Interest Rate: ");
        double rate = in.nextInt();
        rate /= 100;

        System.out.print("Enter the Days: ");
        double days = in.nextInt();
        days /= 365;

        double interest = java.lang.Math.round(pval*rate*days);
        System.out.println("\nMary's Withholding tax Deducted From the Interest: " + (java.lang.Math.round(interest*0.1)));
        System.out.println("Mary's net Interest: " + (interest-(interest*0.1)));
    }
}
