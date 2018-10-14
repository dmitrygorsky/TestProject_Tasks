package by.epam.javabasics.task2;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {


    @Test
    public void calcResult() {

        int x = 1;
        int y = 3;
        String realResult;
        String expectedResult = "Given point lies inside the area";
        realResult = InsideAreaOrNot.checkArea(x, y);
        Assert.assertEquals(expectedResult, realResult);

    }

}
