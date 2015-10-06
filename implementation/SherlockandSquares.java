import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int f = in.nextInt();
            int l = in.nextInt();
            System.out.println(roots(f,l));
        }
    }
    
    static int roots(int first, int last) {
        double root_first = Math.ceil(Math.sqrt(first));
        double root_last = Math.floor(Math.sqrt(last));
        return (int) (root_last - root_first + 1);
    }
}