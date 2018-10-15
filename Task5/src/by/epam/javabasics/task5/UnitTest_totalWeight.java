package by.epam.javabasics.task5;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest_totalWeight {

    @Test
    public void calcResult() {

        Ball b1 = new Ball("Blue", 10);
        Ball b2 = new Ball("Red", 20);
        Ball b3 = new Ball("Green", 30);

        Ball[] balls = {b1, b2, b3};

        Basket basket = new Basket(balls);

        double expectedWeight = 60;

        double realWeight = Logic.totalWeight(basket);

        Assert.assertEquals(expectedWeight,realWeight, 0.0001);

    }

}
