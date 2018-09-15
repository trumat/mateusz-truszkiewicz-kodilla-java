package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case start");
    }

    @After
    public void after(){
        System.out.println("Test case end");
    }

    @Test
    public void testOddNumbersEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenList = exterminator.exterminate(new ArrayList<Integer>());
        //Then
        Assert.assertEquals(0, evenList.size());
    }

    @Test
    public void testOddNumbersNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> mixedList = new ArrayList<Integer>();
        mixedList.add(0);
        mixedList.add(1);
        mixedList.add(2);
        mixedList.add(41);
        mixedList.add(50);
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);
        expectedList.add(2);
        expectedList.add(50);
        //When
        ArrayList<Integer> evenList = exterminator.exterminate(mixedList);
        //Then
        Assert.assertEquals(expectedList, evenList);
    }
}
