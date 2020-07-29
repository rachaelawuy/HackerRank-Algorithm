//Problem at https://www.hackerrank.com/challenges/strange-advertising/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int[] shared = new int[n];
        int[] liked = new int[n];
        int[] cumulative = new int[n];
        shared[0]=5;
        liked[0]=shared[0]/2;
        cumulative[0]=liked[0];
        for(int i=1; i<n; i++){
            shared[i]=liked[i-1]*3;
            liked[i]= shared[i]/2;
            cumulative[i]= cumulative[i-1]+liked[i];
        }
        return cumulative[n-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
