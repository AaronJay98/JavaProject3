import java.util.Scanner;
import java.text.DecimalFormat;

public class E5_18 {

    public static void main(String[] args) {
	    double dblUserIncome;                                       //Will hold the users income as he/she inputs it
	    double dblUserIncomeTax = 0;                                //Will hold the users income tax after calculating what his tax percentage is
        String strDecimalFormat = "##0.00";                         //This will put the users income tax into the correct format (may be adjusted starting at line 39-42)
        Scanner sUserInput = new Scanner(System.in);                //This will get the users input

        System.out.println("Welcome to my program that computes your income tax according to the income tax of 1913.\nPlease enter your income: "); //Output purpose of program and prompts user to input

        dblUserIncome = sUserInput.nextDouble();                    //Stores users input

        //Checks to see if users input is under 0 and if so prompts error and asks user to input again
        while(dblUserIncome < 0) {
            System.out.println("Error: You have entered a number below 0.\nPlease enter your non-negative income: ");
            dblUserIncome = sUserInput.nextDouble();
        }

        //Formulates the income tax of user based on their income
        if (dblUserIncome <= 50000)
            dblUserIncomeTax = dblUserIncome * .01;
        else if (dblUserIncome > 50000 && dblUserIncome <= 75000) {
            dblUserIncomeTax = 50000 * .01;
            dblUserIncomeTax += (dblUserIncome - 50000) * .02;
        }
        else if (dblUserIncome > 75000 && dblUserIncome <= 100000) {
            dblUserIncomeTax =  50000 * .01;
            dblUserIncomeTax += 25000 * .02;
            dblUserIncomeTax += (dblUserIncome - 75000) * .03;
        }
        else if (dblUserIncome > 100000 && dblUserIncome <= 250000) {
            dblUserIncomeTax =  50000 * .01;
            dblUserIncomeTax += 25000 * .02;
            dblUserIncomeTax += 25000 * .03;
            dblUserIncomeTax += (dblUserIncome - 100000) * .04;
        }
        else if (dblUserIncome > 250000 && dblUserIncome <= 500000) {
            dblUserIncomeTax =  50000 * .01;
            dblUserIncomeTax += 25000 * .02;
            dblUserIncomeTax += 25000 * .03;
            dblUserIncomeTax += 150000 * .04;
            dblUserIncomeTax += (dblUserIncome - 250000) * .05;
        }
        else if (dblUserIncome > 500000) {
            dblUserIncomeTax = 50000 * .01;
            dblUserIncomeTax += 25000 * .02;
            dblUserIncomeTax += 25000 * .03;
            dblUserIncomeTax += 150000 * .04;
            dblUserIncomeTax += 250000 * .05;
            dblUserIncomeTax += (dblUserIncome - 500000) * .06;
        }
        else
            System.out.println("Error has occurred");

        double dblTempUserIncome = dblUserIncome;               //Temp variable for calculations in following while loop
        while((dblTempUserIncome / 1000) > 0) {                 //Checks if another comma is needed when outputting
            strDecimalFormat = "###," + strDecimalFormat;       //Creates the comma in the formatting and allows for 3 extra digits
            dblTempUserIncome = dblTempUserIncome /1000;        //Sets the temp variable to result from while condition to be reevaluated
        }
        DecimalFormat dfIncomeTax = new DecimalFormat(strDecimalFormat);       //Creates the actual decimal format based on the result of last while loop

        System.out.println("$" + dfIncomeTax.format(dblUserIncomeTax));        //Outputs the users income tax
    }
}
