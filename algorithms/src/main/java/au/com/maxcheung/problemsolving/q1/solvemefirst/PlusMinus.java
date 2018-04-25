package au.com.maxcheung.problemsolving.q1.solvemefirst;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */

        // java7(arr);

        List<Integer> input = Arrays.stream(arr).boxed().collect(Collectors.toList());
        IntStream intStream1 = Arrays.stream(arr);
        long pos = input.stream().filter(i -> i > 0).count();
        long neg = Arrays.stream(arr).filter(i -> i < 0).count();
        long zero = Arrays.stream(arr).filter(i -> i == 0).count();
        double posRatio = ((double) pos / (double) arr.length);
        double negRatio = ((double) neg / (double) arr.length);
        double zeroRatio = ((double) zero / (double) arr.length);
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(posRatio));
        System.out.println(df.format(negRatio));
        System.out.println(df.format(zeroRatio));
    }

    private static void java7(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for (int arrItr = 0; arrItr < arr.length; arrItr++) {
            pos = pos + (arr[arrItr] > 0 ? 1 : 0);
            neg = neg + (arr[arrItr] < 0 ? 1 : 0);
            zero = zero + (arr[arrItr] == 0 ? 1 : 0);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
