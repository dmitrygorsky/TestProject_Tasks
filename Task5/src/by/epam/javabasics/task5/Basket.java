package by.epam.javabasics.task5;

public class Basket {

    private Ball[] balls;

    public Basket(Ball[] balls) {

        this.balls = balls;
    }

    public Ball[] getBalls() {

        return balls;

    }

    public void setBalls(Ball[] balls) {

        this.balls = balls;

    }

    public int getBasketSize() {

        return balls.length;

    }

    public Ball getBallFromBasket(int i) {

        return balls[i];

    }

    //method that prints color and weight value of each ball in basket
    //given object basket of Basket class

    public void printBasket(Basket basket) {

        for (int i = 0; i < basket.getBasketSize(); i++) {

            System.out.println("Ball of " + basket.getBallFromBasket(i).getColor() + " color that weighs " + basket.getBallFromBasket(i).getWeight() + " kilo(s)");

        }

    }


}
