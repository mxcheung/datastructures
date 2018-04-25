package au.com.maxcheung.challenges.q1.solvemefirst;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.problemsolving.q1.solvemefirst.AVeryBigSum;
import au.com.maxcheung.problemsolving.q1.solvemefirst.MinMaxSum;


public class LeftRotationTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        LeftRotation.leftRotationTimes(intArray,4);
    }

}  