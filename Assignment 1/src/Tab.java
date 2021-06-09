import java.util.Scanner;

public class Tab {
    public static void main(String[] args)
    {
        final double taxPercentage = 0.075;
        final double tipPercentage = 0.18;

        //calculate the amount for the tax

        Scanner in = new Scanner(System.in);

        System.out.print("What is the first name of the server? ");
        String firstName = in.next();
        System.out.print("What is the last name of the server? ");
        String lastName = in.next();
        System.out.print("What is the charge for the meal? ");
        double charge = in.nextDouble();

        char firstInitial = firstName.charAt(0);
        final double tax = charge + taxPercentage;
        System.out.println("tax: " + "$" + tax);
        final double tip = charge * tipPercentage;
        System.out.println("tip: " + "$" + tip);
        String server = (lastName);
        System.out.println("Server: " + server + ", " + firstInitial);
        System.out.println("meal: " + "$" + charge);
        double total = ( tax + tip + charge );
        System.out.printf("Total: $%.2f", total);

    }
}
