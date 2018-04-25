package au.com.maxcheung.problemsolving.q1.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.problemsolving.q1.solvemefirst.Diagonal;


public class DiagonalTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
     // (1) define your java int array
        
        int[][] multi = new int[][]{
            { 11, 2, 4},
            { 4 ,5, 6 },
            { 10, 8 ,-12 },
          };
          
        assertEquals(15 , Diagonal.diagonalDifference(multi));
    }

}