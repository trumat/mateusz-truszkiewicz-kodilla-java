package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLogger() {
        Logger.getInstance().log("log1");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log1", log);
    }
}
