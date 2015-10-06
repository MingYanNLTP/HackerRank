import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int students = in.nextInt();
            int requires = in.nextInt();
            for (int j = 0; j < students; j++) {
                if (in.nextInt() <= 0) {
                    requires--;
                }
            }
            if (requires > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}