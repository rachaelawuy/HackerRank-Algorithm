//Problem at https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        String res="";
        String[] tree= new String[size];
        for(int i=0; i<size; i++){
            tree[i]= "";
            String temp="";
            int counter=i+1;
            for(int j=0; j<(size-counter); j++){
                tree[i]= tree[i].concat(" ");
            }
            while(counter>0){
                temp= temp.concat("#");
                counter-=1;
            }
            tree[i]=tree[i].concat(temp);
            res= res.concat(tree[i]+"\n");
        }
        System.out.print(res);
    }
}
