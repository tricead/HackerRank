import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

public int diff;
 Difference (int[] elements) {
   this.elements = elements;
 }

 void computeDifference() {
   for (int i = 0 ; i < elements.length ; i++) {
     for (int j = i ; j < elements.length ; j++) {
        diff = Math.abs(elements[i] - elements[j]);
        if (diff > maximumDifference) maximumDifference = diff;
     }
   }
 }

}


