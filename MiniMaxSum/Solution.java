//Problem at https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long min=arr[0], max=arr[0], res=arr[0];
        for(int i=1; i<arr.length; i++){
            res+=arr[i];
            if(arr[i]>max){
               max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println((res-max)+" "+(res-min));
    }
}

