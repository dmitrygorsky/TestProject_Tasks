package by.epam.javabasics.task1;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void calcResult() {

        double x = 1;
        double y = 3;
        double realResult;
        double expectedResult = 1.561696434;
        realResult = Formula.formulaCount(x,y);
        Assert.assertEquals(expectedResult, realResult, 0.00000001);
    }
}