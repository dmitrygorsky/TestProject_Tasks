package by.epam.javabasics.task4;

import java.util.Arrays;

public class ProstoeChisloApp {

    public static void main(String[] args) {

        int[] arr = new int[ProstoeChislo.noZerosAllowed(ProstoeChislo.enterNumber())];

        System.out.println("Given array is " + Arrays.toString(ProstoeChislo.fillArray(arr)));

        int k = ProstoeChislo.primeNumbersQTY(ProstoeChislo.booleanPrimeArray(arr));

        if (k == 1) {

            System.out.println("There is " + k + " prime number in given array");
            System.out.println("This number's position is " + Arrays.toString(ProstoeChislo.primeIndexArray(ProstoeChislo.booleanPrimeArray(arr), k)));

        } else {

            System.out.println("There are " + k + " prime numbers in given array");
            System.out.println("These numbers' positions are " + Arrays.toString(ProstoeChislo.primeIndexArray(ProstoeChislo.booleanPrimeArray(arr), k)));

        }

    }

}

