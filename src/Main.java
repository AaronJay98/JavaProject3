import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        E5_18 incomeTax;
        double userIncome;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to program that calcs your income tax. \nPlease enter your income tax: ");
        userIncome = userInput.nextDouble();
        incomeTax = new E5_18(userIncome);

        System.out.println("Here is your income tax: ");
        System.out.println(incomeTax.getIncomeTax());
    }
}
