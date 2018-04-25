package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class PlusMinusTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        // (1) define your java int array

        int[] arr = new int[] { -4, 3, -9, 0, 4, 1 };
        PlusMinus.plusMinus(arr);
    }

}
