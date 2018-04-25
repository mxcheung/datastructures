package au.com.maxcheung.challenges.q3.solvemefirst;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.challenges.q3.solvemefirst.Movies;


public class MoviesTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        assertEquals("adbecf","adbecf");
        Movies.getNumberOfMovies("fdgf");
    }

}  