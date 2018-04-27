package au.com.maxcheung.challenges.q3.solvemefirst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class MoviesTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws Exception {
        assertEquals(97,Movies.getNumberOfMovies("maze"));
        assertEquals(13,Movies.getNumberOfMovies("spiderman"));
        
    }

}  