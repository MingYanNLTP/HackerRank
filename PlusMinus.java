import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for (int i = 0; i < num; i++) {
            int test = in.nextInt();
            if (test > 0) {
                pos++;
            } else if (test < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        pos = pos / num;
        neg = neg / num;
        zero = zero / num;
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
        
    }
}