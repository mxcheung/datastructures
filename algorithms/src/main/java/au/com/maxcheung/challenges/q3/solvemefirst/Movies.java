package au.com.maxcheung.challenges.q3.solvemefirst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

public class Movies {

    /*
     * Complete the function below.
     */
    static int getNumberOfMovies(String substr) {
        /*
         * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
         */

        try {
            URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=maze");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            PageRoot root;
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Gson gson = new Gson();
                String jsonInString = response.toString();
                root= gson.fromJson(jsonInString, PageRoot.class);
                root= gson.fromJson(jsonInString, PageRoot.class);
           //     String response response.toString();
         //       gson.toJson(obj, new FileWriter("D:\\file.json"));
           //     System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return 0;
    }
    
    
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

        res = getNumberOfMovies(_substr);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
