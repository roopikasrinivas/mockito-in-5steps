package com.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Disadvantage of stub
// - lot of code
// - need to create different stubs for different cases (again lot of code)
// - replace stubs with mocks
public class BusinessServiceStubTest {

    @Test
    public void test() {
        BusinessService businessService = new BusinessService(new DataServiceStub());
        int result = businessService.findGreatest();
        assertEquals(9, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] getData() {
        return new int[]{6, 9, 1, 0, 4};
    }
}
