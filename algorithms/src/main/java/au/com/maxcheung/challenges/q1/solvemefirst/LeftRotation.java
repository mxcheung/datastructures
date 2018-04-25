package au.com.maxcheung.challenges.q1.solvemefirst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    
    /*
     * Complete the diagonalDifference function below.
     */
    static int[] leftRotate(int[] a) {
        /*
         * Write your code here.
         */
        int n = a.length;
      //  int[] result = new int[a.length];
      //  for (int aRowItr = 0; aRowItr < n -1  ; aRowItr++) {
      //      result[aRowItr  ] =  a[aRowItr + 1];
      //  }
         int[] result = Arrays.copyOfRange(a, 1, n); 
        
        result[n-1] =  a[0];

        return result;
    }

    static void leftRotationTimes(int[] a, int n) {
     //   int[] b = null;
        int x = n % a.length;
        for (int aRowItr = 0; aRowItr < x   ; aRowItr++) {
           a =  leftRotate(a);
        }
        List<String> result = new ArrayList<String>();
        for (int aRowItr = 0; aRowItr < a.length  ; aRowItr++) {
            result.add(Integer.toString( a[aRowItr]));
         }
        System.out.println(  String.join(" ", result));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
    }
}
