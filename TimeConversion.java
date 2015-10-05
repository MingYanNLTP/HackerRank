import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String[] split = time.split(":");
        if (split[0].equals("12")) {
            split[0] = "00";
        }
        if (split[2].contains("PM")) {
            split[0] = String.valueOf(Integer.parseInt(split[0]) + 12);
        }
        String finalTime = split[0] + ":" + split[1] + ":" + split[2];
        System.out.println(finalTime.substring(0,finalTime.length()-2));
    }
}