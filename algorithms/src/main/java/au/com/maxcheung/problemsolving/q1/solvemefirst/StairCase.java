package au.com.maxcheung.problemsolving.q1.solvemefirst;

import java.util.Collections;
import java.util.Scanner;

public class StairCase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
        for (int i = 0; i < n; i++) {
            String x = String.join("", Collections.nCopies(n - i - 1, " "));
            String y = String.join("", Collections.nCopies(i + 1, "#"));
            System.out.println(x + y);
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
