import java.io.*;
import java.util.*;

public class Solution {

    //reverse numbers between i and j (inclusive)
    private static Integer reverse(Integer numToReverse) {
        StringBuilder stringBuilder = new StringBuilder();
        String numToReverseString = numToReverse.toString();
        stringBuilder.append(numToReverseString);
        stringBuilder.reverse();
        Integer reversedNum = new Integer(stringBuilder.toString());
        return reversedNum;
    }
    
    //add normal and reversed number and modular divide by k return true if beautiful
    private static boolean isBeautiful(Integer regularNum, Integer reversedNum, Integer k) {
        return (((regularNum - reversedNum) % k) == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i = sc.nextInt();
        Integer j = sc.nextInt();
        Integer k = sc.nextInt();
        int counter = 0;
        
        for(Integer regularNum = i; regularNum <= j; regularNum++) {
            Integer reversedNum = reverse(regularNum);
            if(isBeautiful(regularNum, reversedNum, k)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
