package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in the service
        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        // Step 4: Verify the result
        assertEquals("Mock Data", result);
    }
}
