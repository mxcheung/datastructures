package au.com.maxcheung.problemsolving.q1.solvemefirst;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PickingNumber {

    static int pickingNumbers(int[] a) {
        // Complete this function
        Arrays.sort(a);
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        long highVal  = 0;
        for(int a_i = 0; a_i < a.length; a_i++){
             int z = a[a_i];
             long ret = list.stream().filter(x -> ((x == z) || (x == z + 1) )).count();
             highVal = (ret > highVal) ? ret : highVal;
        }
        return (int) highVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
