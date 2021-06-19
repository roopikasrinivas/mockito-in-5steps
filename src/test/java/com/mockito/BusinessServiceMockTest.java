package com.mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessServiceMockTest {

    private DataService dataServiceMock = mock(DataService.class);

    @Test
    public void test() {
        //dataService.getData() => ( new int[] {24, 15, 3, 8, 1});
        when(dataServiceMock.getData()).thenReturn(new int[] {24, 15, 3, 8, 1});
        //constructor mock injection
        BusinessService businessService = new BusinessService(dataServiceMock);
        int result = businessService.findGreatest();
        assertEquals(24, result);
    }

    @Test
    public void testForOneValue() {
        when(dataServiceMock.getData()).thenReturn(new int[] {6});
        BusinessService businessService = new BusinessService(dataServiceMock);
        int result = businessService.findGreatest();
        assertEquals(6, result);
    }
}

