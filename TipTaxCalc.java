/*
4.Display the Itemized Receipt:Print aligned summary with precision.Output the final results neatly using System.out.printf() to display fixed currency formatting alongside your manual casting variables:Plaintext=================================
TIP & TAX CALCULATOR
=================================
Base Bill:         $100.00
Tax Rate:          7.5% ($7.50)
Tip Rate:          18.0% ($18.00)
        ---------------------------------
Grand Total (Raw): $125.50000000000001
Grand Total:       $125.50
Total in Cents:    12550 cents
=================================
*/
import java.util.Scanner;
class GetInformation {
    public static double getInfo(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while(!scanner.hasNextDouble()) {
            System.out.println("Invalid Entry. Input valid numer");
            scanner.next();
        }

        return scanner.nextDouble(); //when you return it the var you assign this to will obtain this value
    }

}


class TipTaxCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseBillAmt = GetInformation.getInfo(scanner, "Enter the base bill amount: ");
        double taxPercent = GetInformation.getInfo(scanner, "What is the tax percent: ");
        double tipPercent = GetInformation.getInfo(scanner, "What is the tip percent: ");
        double rawTax = baseBillAmt * (taxPercent / 100);
        double rawTip = baseBillAmt * (tipPercent / 100);
        double grandTotal = (double) Math.round((baseBillAmt + rawTax + rawTip) * 100) / 100;

        System.out.println("""
                ==========================
                     Tip and Tax Calc
                ==========================""");
        System.out.println("Base Bill:          " + baseBillAmt);
        System.out.println("Tax Rate:       " + taxPercent + "% (" + rawTax + ")");
        System.out.println("Tip Rate:       " + tipPercent + "% (" + rawTip + ")");
        System.out.println("""
                --------------------------""");
        System.out.println("Grand Total:        " + grandTotal);
        System.out.println("Total in cents:     " + (int) (grandTotal*100) + " cents");



    }

}


