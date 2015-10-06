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
            System.out.println(growth(in.nextInt()));    
        }
    }
    
    static int growth(int cycles) {
        int tree = 1;
        for (int i = 0; i < cycles; i += 2) {
            tree = 2 * tree + 1;
        }
        if (cycles % 2 == 1) {
            tree = tree - 1;
        }
        return tree;
    }
}