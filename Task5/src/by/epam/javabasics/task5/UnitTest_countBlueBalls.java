package by.epam.javabasics.task5;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest_countBlueBalls {

    @Test
    public void calcResult() {

        String[] arrColors = {"Black", "White", "Red", "Green", "Blue"};

        Ball b1 = new Ball("Blue", 10);
        Ball b2 = new Ball("Red", 20);
        Ball b3 = new Ball("Green", 30);
        Ball b4 = new Ball("Blue", 40);
        Ball b5 = new Ball("Blue", 50);
        Ball b6 = new Ball("White", 60);

        Ball[] balls = {b1, b2, b3, b4, b5, b6};

        Basket basket = new Basket(balls);

        int expectedCount = 3;

        int realCount = Logic.countBlueBalls(basket, arrColors);

        Assert.assertEquals(expectedCount, realCount);

    }

}
