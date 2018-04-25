package au.com.maxcheung.challenges.q3.solvemefirst;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class MergeStringsTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws FileNotFoundException, IOException {
        assertEquals("adbecf", MergeStrings.mergeStrings("abc", "def"));
        assertEquals("asbtcuvwx", MergeStrings.mergeStrings("abc", "stuvwx"));
        assertEquals("zibdxonwsdjkdns", MergeStrings.mergeStrings("zbxnsjdns", "idowdk"));
        
//        int x = a.length() ;

//        assertEquals("adbecf","adbecf");
  //      Solution.getNumberOfMovies("fdgf");
    }

}  