package by.epam.javabasics.task3;

import java.util.Scanner;

public class Formula {

    //method that lets user enter a number of double type and throws error message
    //if anything else is entered

    public static double enterNumber(String msg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number " + msg);

        while (!scan.hasNextDouble()) {

            System.out.println("Invalid number! Try again");
            scan.next();

        }

        return scan.nextDouble();

    }

    //method that checks given value B of double type against value A of double type
    //and throws error message if B is less or equals to A
    //letting user change B value to valid

    public static double checkAvsB(double a, double b) {

        while (b < a || b == a) {

            System.out.println("Number B should be bigger than number A! Try again: ");
            b = enterNumber("B: ");

        }

        return b;

    }

    //method that checks given value H of double type against the subtraction result of
    //values B and A of double type and throws error message if H is more or equals to (B - A)
    //letting user change H value to valid

    public static double checkHvsAB(double a, double b, double h) {

        while (h == (b - a) || h > (b - a)) {

            System.out.println("Number H cannot be bigger than difference between A and B! Try again: ");
            h = enterNumber("H: ");

        }

        return h;
    }

    //method that creates array of String values counting X
    //out of given values A, B and H of double type

    public static String[] returnX(double a, double b, double h) {

        double m = b - ((b - a) % h);

        Double n = (m - a) / h;

        int index = n.intValue() + 1;

        String[] arr = new String[index];

        int k = 0;

        for (double x = a; x <= b; x += h) {

            arr[k] = String.format("%.2f",x);

            k++;

        }

        return arr;

    }

    //method that creates array of String values out of
    //given values A, B and H of double type counting
    //result of function f(X) = tg(X)

    public static String[] returnFX(double a, double b, double h) {

        double m = b - ((b - a) % h);

        Double n = (m - a) / h;

        int index = n.intValue() + 1;

        String[] arr = new String[index];
        int k = 0;

        for (double x = a; x <= b; x += h) {

            double fx = Math.tan(x);
            arr[k] = String.format("%.2f",fx);

            k++;

        }

        return arr;

    }

}

