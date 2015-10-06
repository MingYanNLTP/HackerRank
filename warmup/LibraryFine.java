import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String[] returnDate = in.nextLine().split(" ");
        String[] dueDate = in.nextLine().split(" ");
        int[] returnD = new int[3];
        int[] dueD = new int[3];
        for (int i = 0; i < 3; i++) {
            returnD[i] = Integer.parseInt(returnDate[i]);
            dueD[i] = Integer.parseInt(dueDate[i]);
        }
        int fine = 0;
        if (returnD[2] > dueD[2]) {
            fine = 10000;
        } else if (returnD[1] > dueD[1] && returnD[2] == dueD[2]) {
            fine = 500 * (returnD[1] - dueD[1]);
        } else if (returnD[0] > dueD[0] && returnD[1] == dueD[1] && returnD[2] == dueD[2]) {
            fine = 15 * (returnD[0] - dueD[0]);
        }
        System.out.println(fine);
    }
}