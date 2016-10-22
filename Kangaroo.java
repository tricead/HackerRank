import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). 
The first kangaroo starts at location  and moves at a rate of  meters per jump. 
The second kangaroo starts at location  and moves at a rate of  meters per jump. 
Given the starting locations and movement rates for each kangaroo, can you determine 
if they'll ever land at the same location at the same time? 
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(willLandSameLocation(x1,v1,x2,v2)){System.out.println("YES");}
        else{System.out.println("NO");}
    }
    
    private static boolean willLandSameLocation(int x1, int v1, int x2, int v2) {
        if(x1 > x2 && v1 > v2) {
            return false;
        }
        else if(x2 > x1 && v2 > v1) {
            return false;
        }
        else {
            while(x1 <= 100000000 && x2 <= 1000000000){
                x1 += v1;
                x2 += v2;
                if(x1 == x2) {
                    return true;
                }
            }
        }
        return false;
    }
}
