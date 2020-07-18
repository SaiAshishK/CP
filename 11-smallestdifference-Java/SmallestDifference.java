// Write the function smallestDifference(a) that takes a list of integers and returns 
// the smallest absolute difference between any two 
// integers in the list. If the list is empty, return -1. For example:
//       assert(smallestDifference([19,2,83,6,27]) == 4)
// The two closest numbers in that list are 2 and 6, and their difference is 4.
import java.util.*;

public class SmallestDifference {

    public static int smallestDifference(int[] a) {
        // Your code goes here
        if(a.length == 0){
            return -1;
        }
        int res = 500;
        for(int i = 0 ; i < a.length-1 ; i++){
            int c = Math.abs(a[i] - a[i+1]);
            System.out.println(c);
            if(c < res){
                res = c;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(smallestDifference(new int[]{-59,-36,-13,1,-53,-92,-2,-96,-54,75}));
    }
}
