// Problem at https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        
        Map<Integer, Integer> yearsMapped = new HashMap<Integer, Integer>();
        int feb = 28;
        yearsMapped.put(1, new Integer (31));
        if(year<1918){
          if(year%4==0){
            feb=29;
          }
        } else if(year==1918){
          feb=15;
        } else {
          if(year%400 == 0 || (year%4==0 && year%100!=0)){
            feb=29;
          }
        }
        yearsMapped.put(2, feb);
        yearsMapped.put(3, new Integer (31));
        yearsMapped.put(4, new Integer (30));
        yearsMapped.put(5, new Integer (31));
        yearsMapped.put(6, new Integer (30));
        yearsMapped.put(7, new Integer (31));
        yearsMapped.put(8, new Integer (31));
        yearsMapped.put(9, new Integer (30));
        yearsMapped.put(10, new Integer (31));
        yearsMapped.put(11, new Integer (30));
        yearsMapped.put(12, new Integer (31));

        int res=0, index=1;
        while((res+yearsMapped.get(index))<=256){
            res+=yearsMapped.get(index);
            index+=1;
        }
        int date= 256-res;
        String monthRes= Integer.toString(index);
        if(index<10) {
            monthRes="0"+Integer.toString(index);
        }
        String result= Integer.toString(date)+"."+monthRes+"."+Integer.toString(year);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
