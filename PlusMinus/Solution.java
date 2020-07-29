//Problem at https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] numbers= new int[size];
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int pos=0, neg=0, zero=0;
        for(int i=0; i<size; i++){
            if(numbers[i]>0){
                pos+=1;
            } else if(numbers[i]<0){
                neg+=1;
            } else{
                zero+=1;
            }
        }
        System.out.printf("%.6f%n",(pos*1.0)/(size));
        System.out.printf("%.6f%n",(neg*1.0)/(size));
        System.out.printf("%.6f%n",(zero*1.0)/(size));
    }
}
