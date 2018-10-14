package by.epam.javabasics.task3;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest_X {

    //tests that correct array of X values is created

    @Test
    public void calcXArray() {

        double a = 1;
        double b = 2;
        double h = 0.1;

        String[] expectedX = {"1,00", "1,10", "1,20", "1,30", "1,40", "1,50", "1,60", "1,70", "1,80", "1,90"};

        String[] realX = Formula.returnX(a,b,h);
        Assert.assertArrayEquals(expectedX,realX);

    }

}
