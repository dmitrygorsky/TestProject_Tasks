package by.epam.javabasics.task1;

import java.util.Scanner;

public class Formula {

    //method that lets user enter a number of double type and throws error message
    //if anything else is entered

    public static double enterNumber(String msg) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number " + msg);

        while (!scan.hasNextDouble()) {

            System.out.print("Invalid number! Try again: ");
            scan.next();

        }

        return scan.nextDouble();

    }

    //method that counts the denominator out of given
    //values X and Y of double type and throws an error
    //if denominator equals to zero finishing the process with status 1

    public static double moduleCount(double x, double y) {

        double c = 1 + (Math.pow(x,2) * Math.pow(y,2));

        if (c == 0) {

            System.out.println("Divide by zero is forbidden");
            System.exit(1);
        }

        double d = Math.abs(x - ((2 * x) / c));

        return d;

    }

    //method that counts squared sin of (x + y) out of given
    //values X and Y of double type

    public static double sinCount(double x, double y) {

        double e = (Math.sin(x) * Math.cos(y)) + (Math.cos(x) * Math.sin(y));

        double f = Math.pow(e,2);

        return f;
    }

    //method that counts the formula result out of given values X and Y of double type

    public static double formulaCount(double x, double y) {

        double result = (1 + sinCount(x,y)) / (2 + moduleCount(x,y)) + x;

        return result;
    }

}
