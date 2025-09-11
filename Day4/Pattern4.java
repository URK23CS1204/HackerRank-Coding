import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n,row,star,space;
        n=sc.nextInt();
        
        for (row = 1; row <= n; row++) {
            for (space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
