package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        String log = "Log_test";
        Logger.getInstance().log(log);

        // When
        String logToTest = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Log_test", logToTest);
    }
}
