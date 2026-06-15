import java.util.Scanner;

public class FinancialForecast {

    public static double forecast(double amount, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return amount;
        }

        // Recursive Case
        return forecast(amount * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current investment amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRate = sc.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = forecast(amount, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + futureValue);

        sc.close();
    }
}