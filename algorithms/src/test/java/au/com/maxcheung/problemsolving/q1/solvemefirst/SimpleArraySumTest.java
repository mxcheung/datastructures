package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.problemsolving.q1.solvemefirst.SimpleArraySum;


public class SimpleArraySumTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
     // (1) define your java int array
        int[] intArray = new int[] {1, 2, 3, 4, 10, 11};
        assertEquals(31 , SimpleArraySum.simpleArraySum(intArray));
    }

}