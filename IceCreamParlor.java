import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void printIceCream(int[] arr, int m) {
        int sunnyChoice = 0;
        int johnnyChoice = 0;
        for(int i = 0; i < arr.length; i++) {
            //System.out.println("i " + );
            for(int j = i + 1; j < arr.length; j++) {
                //System.out.println("j " + arr[j]);
                if(arr[i] + arr[j] == m) {
                    sunnyChoice = i + 1;
                    johnnyChoice = j + 1;
                    //System.out.println(sunnyChoice);
                }
            }
        }
        if(sunnyChoice < johnnyChoice) {
            System.out.println(sunnyChoice + " " + johnnyChoice);
        }
        else {
            System.out.println(johnnyChoice + " " + sunnyChoice);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            //m is total money to purchase ice cream
            int m = sc.nextInt();
            //n is number of flavors to choose from
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            printIceCream(arr, m);
        }
    }
}
