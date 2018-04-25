package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.problemsolving.q1.solvemefirst.AVeryBigSum;


public class AVeryBigSumTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
     // (1) define your java int array
        long[] ar = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        assertEquals(5000000015L , AVeryBigSum.aVeryBigSum(5, ar));
    }

}