import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year=sc.nextInt();
        if((year%100==0 && (year%400!=0) || year%4!=0)){
            System.out.println("Not a Leap year");
        }
        else{
            System.out.println("Leap year");
        }
    }
}
