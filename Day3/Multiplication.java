import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a,b,i,ans=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++){
            ans=ans+a;
        }
        System.out.println(ans);
    }
}
