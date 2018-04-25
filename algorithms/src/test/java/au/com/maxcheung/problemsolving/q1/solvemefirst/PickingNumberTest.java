package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class PickingNumberTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        // (1) define your java int array

        int[] arr = new int[] { 1 ,1 ,2,2,4,4,5,5,5 };
        assertEquals(5, PickingNumber.pickingNumbers(arr));
        int[] arr2 = new int[] { 1 ,2, 2, 3, 1,2 };
        assertEquals(5, PickingNumber.pickingNumbers(arr2));
    }

}
