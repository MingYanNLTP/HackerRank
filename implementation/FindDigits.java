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
            System.out.println(digits(in.nextInt()));
        }
    }
    
    static int digits(int num) {
        String dig = Integer.toString(num);
        int result = 0;
        int[] numbers = new int[dig.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = dig.charAt(i) - '0';
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && num % numbers[i] == 0) {
                result++;
            }
        }
        return result;
    }
}