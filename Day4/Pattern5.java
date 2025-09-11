import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n,row,col,num;
         n = sc.nextInt();
          for ( row = 1; row <= n; row++) {
             num = (row % 2 == 0) ? 2 : 1;
            for (col = 1; col <= row; col++) {
                System.out.print(num);
                num += 2;
            }
            System.out.println();
        }
    }
}
