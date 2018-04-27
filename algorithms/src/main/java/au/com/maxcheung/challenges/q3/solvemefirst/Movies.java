package au.com.maxcheung.challenges.q3.solvemefirst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Movies {

    /*
     * Complete the function below.
     */
    static int getNumberOfMovies(String substr) throws Exception {
        /*
         * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
         */

        final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;
        String response = getResponse(url);
        JsonParser parser = new JsonParser();
        JsonElement rootNode = parser.parse(response);
        JsonObject details = rootNode.getAsJsonObject();
        JsonElement totalMovies = details.get("total");
        int total = Integer.valueOf(totalMovies.toString());
        List<String> movies = getMovieList(substr, details);
        assert total  == movies.size() ;
        return total;
    }

    private static  List<String>  getMovieList(String substr, JsonObject details) throws Exception {
        List<String> movies = new ArrayList<>();
        JsonElement totalPages = details.get("total_pages");
        int currentPage = 0;
        while (currentPage++ < Integer.parseInt(totalPages.toString())) {
            nextPage(movies, currentPage, substr);
        }
        return movies;
    }

    public class Movie {

    }

    static void nextPage(List<String> movies, int currentPage, String substr) throws Exception {
        final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
        String response = getResponse(url + substr + "&page=" + currentPage);
        JsonParser parser = new JsonParser();
        JsonElement rootNode = parser.parse(response);

        JsonObject details = rootNode.getAsJsonObject();
        JsonElement data = details.get("data");
        JsonArray jsonArray = data.getAsJsonArray();
        for (JsonElement each : jsonArray) {
            JsonObject titleObject = each.getAsJsonObject();
            String title = titleObject.get("Title").getAsString();
            movies.add(title);
        }
    }

    static String getResponse(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
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
