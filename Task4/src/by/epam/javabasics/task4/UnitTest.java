package by.epam.javabasics.task4;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void calcResult() {


        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int k = 4;
        int[] expectedArr = {0,1,3,5};
        int[] realArr;
        realArr = ProstoeChislo.primeIndexArray(ProstoeChislo.booleanPrimeArray(arr), k);
        Assert.assertArrayEquals(expectedArr,realArr);

    }

}
