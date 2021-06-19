package com.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//Mockito makes tests readable, simple and lightweight
@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceMockAnnotationsTest {

    //Create Mock
    @Mock
    private DataService dataServiceMock;

    //Inject Mock : Create businessService and inject dataServiceMock into businessService
    @InjectMocks
    private BusinessService businessService;

    @Test
    public void testForAllData() {
        when(dataServiceMock.getData()).thenReturn(new int[]{24, 15, 3, 8, 1});
        assertEquals(24, businessService.findGreatest());
    }

    @Test
    public void testForOneData() {
        when(dataServiceMock.getData()).thenReturn(new int[]{6});
        assertEquals(6, businessService.findGreatest());
    }

    @Test
    public void testForNoData() {
        when(dataServiceMock.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessService.findGreatest());
    }
}

