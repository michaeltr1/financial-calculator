import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Mortgage Calculator: accepts principal, annual interest rate
        // as a percent, and loan length in years from the user

        System.out.println("Hello! Input your Loan Amount. ");
        double loanAmount = read.nextDouble();
        System.out.println("Input your Annual Rate. ");
        double monthlyInterestRateAsPercent = read.nextDouble();
        System.out.println("Input Year Length of Loan. ");
        double loanLengthYears = read.nextDouble();

        // Calculator Stuff for

        double annualRateInDecimals = monthlyInterestRateAsPercent / 100;
        double monthlyInterestRate = annualRateInDecimals / 12;
        double numberOfMonthlyPayments = 12 * loanLengthYears;
        double growth = Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments);
        System.out.println(growth);
        double monthlyPayment = loanAmount * (monthlyInterestRate * growth) / (growth - 1);
        System.out.printf("Your monthly payment is $%.2f%n", monthlyPayment);
        double totalInterest = ((monthlyPayment * numberOfMonthlyPayments) - loanAmount);
        System.out.print("Total interest accured is $" + totalInterest);
    }
}

    //Calculator stuff for exercise 2


