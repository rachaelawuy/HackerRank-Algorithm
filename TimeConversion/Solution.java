//Problem at https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        boolean morning=true;
        int hour=Integer.parseInt(s.substring(0,2));
        if(s.charAt(8)=='P'){
            morning=false;
        }
        if(!morning){
            if(hour!=12){
                hour+=12;
            }
        } else {
            if(hour==12){
                hour=0;
            }
        }
        String h="";
        if(hour<10) {
            h="0".concat(hour+"");
        } else {
            h=h.concat(hour+"");
        }
        return h.concat(s.substring(2,8));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

