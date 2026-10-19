import java.util.Scanner;

public class CALCULATOR2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Calculator 2
        // Add... Deposit / Annual Interest Rate as Percent / Number of years from a user
        System.out.println("How much did you add for a deposit?");
        double deposit = read.nextDouble();

        System.out.println("Input your Annual Interest Rate as a decimal EX. 7.20% = .072 ");
        double annualInterestRate = read.nextDouble();

        System.out.println("Number of Years CD Earns Interest");
        double yearsOfInterest = read.nextDouble();
        System.out.println(yearsOfInterest);
        //days per year
        double daysPerYear = 365;
        double totalDays = (daysPerYear * yearsOfInterest);


        double growth = Math.pow((1 + annualInterestRate / daysPerYear), totalDays);        double futureAmount = deposit * growth;
        System.out.println(("Your total interest earned is $") + futureAmount);



    }
}