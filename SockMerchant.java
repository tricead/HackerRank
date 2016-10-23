import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
John's clothing store has a pile of n loose socks where each sock i is labeled with an integer, 
c_i, denoting its color. He wants to sell as many socks as possible, 
but his customers will only buy them in matching pairs. 
Two socks i, and j, are a single matching pair if c_i = c_j.
Given  and the color of each sock, how many pairs of socks can John sell?
 */
public class Solution {
    
    private static int[] sort(int[] c){
        int first, temp;
        for(int i = c.length-1; i > 0; i--) {
            first = 0;
            for(int j = 1; j <= i; j++) {
                if(c[j] < c[first]) {first = j;}
            }
            temp = c[first];
            c[first] = c[i];
            c[i] = temp;
        }
        return c;
    }
    
    private static int howManyPairs(int[] c) {
        int numPairs = 0;
        for(int i = 0; i < c.length-1; i++) {
            if(c[i] == c[i+1]) {i=i+1;
                                numPairs++;}
            //System.out.println(numPairs);
        }
        return numPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        c = sort(c);
        System.out.println(howManyPairs(c));
    }
}
