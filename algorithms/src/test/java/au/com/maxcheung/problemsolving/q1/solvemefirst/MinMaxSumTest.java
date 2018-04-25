package au.com.maxcheung.problemsolving.q1.solvemefirst;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class MinMaxSumTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        MinMaxSum.miniMaxSum(intArray);
    }

}
