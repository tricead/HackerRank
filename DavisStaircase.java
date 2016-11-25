import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static HashMap<Integer, Integer> myMap = new HashMap<>();
    
    private static int numWaysToClimb(int n) {
        
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(n == 3) {
            return 4;
        }
        if(!myMap.containsKey(n)) {
            int numWaysToClimb = numWaysToClimb(n - 1) + numWaysToClimb(n - 2) + numWaysToClimb(n - 3);
            myMap.put(n, numWaysToClimb);
        }
        return myMap.get(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(numWaysToClimb(n));
        }
        
    }
}
