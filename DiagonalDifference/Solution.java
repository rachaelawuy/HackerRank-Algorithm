//Problem at https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int diag1=0, diag2=0;
        int[][] matrix= new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=sc.nextInt();
                if(i==j){
                    diag1+=matrix[i][j];
                }
                if(i+j==(size-1)){
                    diag2+=matrix[i][j];
                }
            }
        }
        System.out.print(Math.abs(diag1-diag2));
    }
}
