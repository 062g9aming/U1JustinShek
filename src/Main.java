import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Given Inputs
        System.out.println("Input total bill (including taxes): ");
        double bill = (int)(s.nextDouble() * 100)/100.00;
        System.out.println("Input Percentage: ");
        int percentage = s.nextInt();
        System.out.println("Input the amount of people at the party: ");
        int people = s.nextInt();

        //Calculated items
        double tip = (bill * percentage);
        double totalBill = (bill + tip);
        double tipPerPerson = (tip / people);
        double totalPerPerson = (totalBill / people);

        //Results
        System.out.println("Tip: $" + df.format(tip));
        System.out.println("Total bill: $" + df.format(totalBill));
        System.out.println("Tip per person: $" + df.format(tipPerPerson));
        System.out.println("Total per person: $" + df.format(totalPerPerson));

}}
//Ask and define for double variable input for:
//Total bill
//Ask and define for int variable input for:
//Tip Percentage
//Number of people in the party
//Calculate the following variable using givens:
//The total tip amount–(Double) of Total Bill x Tip Percentage divided by 100
//The total bill including tip–(Double) Total Bill + The total tip amount
//The tip per person–(Double) The total tip amount divided by Number of people in the party
//The total per person–(Double) The total bill including tip divided by Number of people in the party