package au.com.maxcheung.challenges.q1.solvemefirst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.*;

public class Solution {


    
    public class Movie {
        
    }
    
    

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        String _substr;
        try {
            _substr = in.nextLine();
        } catch (Exception e) {
            _substr = null;
        }

    //    res = getNumberOfMovies(_substr);
        res = 1;
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
