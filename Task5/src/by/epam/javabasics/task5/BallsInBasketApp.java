package by.epam.javabasics.task5;

public class BallsInBasketApp {

    public static void main(String[] args) {

        String[] arrColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Violet", "White", "Black"};

        Ball[] balls = new Ball[arrColors.length];

        Basket basket = new Basket(Ball.ballsArray(balls, arrColors));

        System.out.println("The following balls were put into the basket: \n");

        basket.printBasket(basket);

        System.out.println("--------------------------------------------------");

        Logic.printBlueBalls(basket, arrColors);

        System.out.println("The weight of the balls in the basket is " + Logic.totalWeight(basket) + " kilo(s)");

    }

}

