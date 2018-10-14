package by.epam.javabasics.task4;

import java.util.Random;
import java.util.Scanner;

public class ProstoeChislo {

    //method that lets user enter a number of int type which is greater than 1
    //and throws error message if anything else is entered

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number greater than 1: ");

        while (!scan.hasNextInt()) {

            System.out.println("Invalid number! Try again: ");
            scan.next();

        }

        return scan.nextInt();

    }

    //method that checks if given value X of int type is greater than 1
    //and throws error message if it's not
    //letting user change value X to valid

    public static int noZerosAllowed(int x) {

        while (x <= 1) {

            System.out.println("Given number is greater or equals to 1. This is not allowed.");
            x = enterNumber();

        }

        return x;

    }

    //method that fills an array with random values of int type

    public static int[] fillArray(int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100);

        }

        return arr;

    }

    //method that checks if given value X of int type is prime or not

    public static boolean checkPrime(int x) {

        boolean b = true;

        int result;

        for (int i = 2; i < x; i++) {

            result = x % i;

            if (result == 0) {

                b = false;
                return b;

            }

        }

        if (x == 0 || x == 1) {

            b = false;

        }

        return b;

    }

    //method that checks given array of int type and creates array of boolean type
    //where "false" values are put instead of non-prime numbers
    //and "true" values are put instead of prime numbers

    public static boolean[] booleanPrimeArray(int[] arr) {

        boolean[] arr_boolean = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            arr_boolean[i] = ProstoeChislo.checkPrime(arr[i]);

        }

        return arr_boolean;

    }

    //method that counts the quantity of prime numbers in given array of boolean type

    public static int primeNumbersQTY(boolean[] arr_boolean) {

        int k = 0;

        for (int i = 0; i < arr_boolean.length; i++) {

            if (arr_boolean[i] == true) {

                k += 1;

            }

        }

        return k;

    }

    //method that checks false and true values in given array of boolean type
    //and puts index of each "true" element in boolean array into its own cell
    //given value K of int type (represents quantity of "true" values in given array) is used as array length

    public static int[] primeIndexArray(boolean[] arr_boolean, int k) {

        int[] arr_prime = new int[k];

        int n = 0;

        for (int i = 0; i < arr_boolean.length; i++) {

            if (arr_boolean[i] == true) {

                arr_prime[n] = i;

                n += 1;

            }

        }

        return arr_prime;

    }

}


