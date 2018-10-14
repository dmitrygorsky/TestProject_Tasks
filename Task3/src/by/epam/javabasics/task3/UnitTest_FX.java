package by.epam.javabasics.task3;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest_FX {

    //tests that correct array of function f(X) = tg(X) resulting values is created

    @Test
    public void calcFXArray() {

        double a = 0;
        double b = 10;
        double h = 1;

        String[] expectedX = {"0,00", "1,56", "-2,19", "-0,14", "1,16", "-3,38", "-0,29", "0,87", "-6,80", "-0,45", "0,65"};

        String[] realFX = Formula.returnFX(a,b,h);
        Assert.assertArrayEquals(expectedX,realFX);

    }

}
