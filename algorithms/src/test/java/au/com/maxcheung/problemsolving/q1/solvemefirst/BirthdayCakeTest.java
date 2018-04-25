package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class BirthdayCakeTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        int[] arr = new int[] { 3, 2, 1, 3};
        int ret = BirthdayCake.birthdayCakeCandles(4, arr);
        assertEquals(2 , ret);
    }

}
