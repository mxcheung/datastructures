package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class SolveMeTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        assertEquals(5 , SolveMe.solveMeFirst(2, 3));
    }

}