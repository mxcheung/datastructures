package au.com.maxcheung.problemsolving.q1.solvemefirst;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        Arrays.sort(arr);
        long sum = 0;
        for (int arrItr = 0; arrItr < arr.length  ; arrItr++) {
            sum = sum + arr[arrItr];
        }
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
