package com.mockito;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    private List listMock = mock(List.class);

    @Test
    public void testSize(){
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
        assertEquals(10, listMock.size());
    }

    @Test
    public void testMultipleReturns(){
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGetSpecificParameter(){
        when(listMock.get(0)).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGetGenericParameter(){
        when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals("Some String", listMock.get(1));
    }
}
