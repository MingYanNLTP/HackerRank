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
        for (int i = 0; i < num; i++) {
            int decent = in.nextInt();
            calculateDecent(decent);
            System.out.println();
        }
    }
    
    static void calculateDecent(int decent) {
        int threes = -1;
        int fives = -1;
        for (int i = decent / 3; i >= 0; i--) {
            if ((decent - i * 3) % 5 == 0) {
                threes = i;
                fives = (decent - i * 3) / 5;
                break;
            }
        }
        if (threes != -1) {
            for (int i = 0; i < threes; i++) {
                System.out.print(555);
            }
            for (int i = 0; i < fives; i++) {
                System.out.print(33333);
            }    
        } else {
            System.out.print(-1);
        }
    }
}