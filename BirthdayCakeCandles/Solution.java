//Problem at https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int counter=0, tallest=ar[0];
        for(int i=1; i<ar.length; i++){
            if(ar[i]>tallest) tallest=ar[i];
        }
        for(int i=0; i<ar.length; i++){
            if(ar[i]==tallest) counter+=1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

