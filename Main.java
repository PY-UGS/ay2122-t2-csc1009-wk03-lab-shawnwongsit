import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner rateInput = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double rate = rateInput.nextDouble();

        Scanner yearsInput = new Scanner(System.in);
        System.out.print("Enter number of years as an integer: ");
        int years = yearsInput.nextInt();

        Scanner loanInput = new Scanner(System.in);
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loan = loanInput.nextDouble();

        Loan loan01 = new Loan(rate, years, loan);
        System.out.println("The loan was created on " + loan01.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", loan01.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", loan01.getTotalPayment()));
    }
}
