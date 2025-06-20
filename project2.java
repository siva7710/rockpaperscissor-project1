import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (Example rates, adjust as needed)
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        double gbpToInr = 105.0;

        // User input
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        System.out.println("Convert from (USD/EUR/GBP):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Convert to (INR):");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = 0;

        // Conversion logic
        if (toCurrency.equals("INR")) {
            switch (fromCurrency) {
                case "USD":
                    convertedAmount = amount * usdToInr;
                    break;
                case "EUR":
                    convertedAmount = amount * eurToInr;
                    break;
                case "GBP":
                    convertedAmount = amount * gbpToInr;
                    break;
                default:
                    System.out.println("Invalid currency input.");
                    return;
            }
        } else {
            System.out.println("Conversion to the selected currency is not supported.");
            return;
        }

        // Output result
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);

        scanner.close();
    }
}
