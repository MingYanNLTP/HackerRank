import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int square = in.nextInt();
        int leftDiag = 0;
        int rightDiag = 0;
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                int temp = in.nextInt();
                if (i == j) {
                    leftDiag += temp;
                }
                if (i + j == square -1) {
                    rightDiag += temp;
                }
            }
        }
        System.out.println(Math.abs(leftDiag - rightDiag));
    }
}