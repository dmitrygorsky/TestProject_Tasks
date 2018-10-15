package by.epam.javabasics.task5;

public class Logic {

    //method that counts total weight of balls in the basket
    //given object basket of Basket class

    public static double totalWeight(Basket basket) {

        double sum = 0;

        for (int i = 0; i < basket.getBasketSize(); i++) {

            sum += basket.getBallFromBasket(i).getWeight();

        }

        return sum;
    }

    //method that counts total quantity of balls of certain color in the basket
    //given object basket of Basket class, given array of String type

    public static int countBlueBalls(Basket basket, String[] arrColors) {

        int k = 0;

        for (int i = 0; i < basket.getBasketSize(); i++) {

            if (basket.getBallFromBasket(i).getColor() == arrColors[4]) {

                k++;
            }

        }

        return k;

    }

    //method that prints out how many balls of certain color are in the basket
    //given object basket of Basket class, given array of String type

    public static void printBlueBalls(Basket basket, String[] arrColors) {

        if (Logic.countBlueBalls(basket, arrColors) == 1) {

            System.out.println("There is " + Logic.countBlueBalls(basket, arrColors) + " " + arrColors[4] + " ball in the basket");

        } else if (Logic.countBlueBalls(basket, arrColors) == 0) {

            System.out.println("There are no " + arrColors[4] + " balls in the basket");

        } else {

            System.out.println("There are " + Logic.countBlueBalls(basket, arrColors) + " " + arrColors[4] + " balls in the basket");

        }

    }

}
