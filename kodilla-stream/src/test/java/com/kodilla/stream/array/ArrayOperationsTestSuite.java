package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] array = {1, 2, 3, 10, 242, 1019};
        //When
        double average = ArrayOperations.getAverage(array);
        //Then
        Assert.assertEquals(212.833333333, average, 0.000000001);
    }
}
