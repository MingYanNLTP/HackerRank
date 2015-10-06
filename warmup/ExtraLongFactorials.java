import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger num = new BigInteger(in.nextLine());
        System.out.println(factorial(num));
    }
    
    static BigInteger factorial(BigInteger x) {
        if (x.equals(BigInteger.ONE)) {
            return x;
        }
        x = x.multiply(factorial(x.subtract(BigInteger.ONE)));
        return x;
    }
}