import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i, start,sum = 0;

        start = sc.nextInt();
       

        for (i = 1; i <= start; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
           
        }
        System.out.print(sum + "");
    }
}
