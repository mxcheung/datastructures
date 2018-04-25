package au.com.maxcheung.challenges.q3.solvemefirst;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeStrings {

    static String mergeStrings(String a, String b) {
        int x = a.length();
        int y = b.length();
        int minSize = x < y ? x : y;

        String result = "";
        for (int i = 0; i < minSize; i++) {
            result = result + a.substring(i, i + 1);
            result = result + b.substring(i, i + 1);
        }
        if (x < y) {
            result = result + b.substring(x, y);

        } else {
            result = result + a.substring(y, x);
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }

        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }

        res = mergeStrings(_a, _b);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
