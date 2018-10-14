package by.epam.javabasics.task2;

import java.util.Scanner;

public class InsideAreaOrNot {

    //method that lets user enter a number of int type and throws error message
    //if anything else is entered

    public static int enterNumber(String msg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number " + msg);

        while (!scan.hasNextInt()) {

            System.out.println("Invalid number! Try again: ");
            scan.next();

        }

        return scan.nextInt();

    }

    //method that accepts given values X and Y of int type
    //and checks if these values lie inside the given area

    public static String checkArea(int x, int y) {

        int a1 = -6;

        int b1 = 6;

        int d1 = -3;

        int a2 = -4;

        int b2 = 4;

        int d2 = 5;

        String Positive = "Given point lies inside the area";
        String Negative = "Given point lies outside the area";

        if (x >= a1 && x <= b1 && y <= 0) {

            if (y >= d1) {

                return Positive;

            }

        } else if (x >= a2 && x <= b2 && y > 0) {

            if (y <= d2) {

                return Positive;
            }

        }

        return Negative;
    }


}
