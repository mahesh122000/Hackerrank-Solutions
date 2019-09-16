import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

   
    public static void main(String[] args) 
           {Scanner s=new Scanner(System.in);
           int tt=s.nextInt();
           while(tt-->0)
           {int n=s.nextInt();
           int a[]=new int[n];
           int count=0;
           for(int i=0;i<n;i++)
           {a[i]=s.nextInt();
           }
           int min = Arrays.stream(a).min().getAsInt();
           int ans = Integer.MAX_VALUE;
           for (int i = 0; i < 5; ++i) {
            int ops = 0;
            for (int j = 0; j < a.length; ++j) {
            int t = a[j] - (min - i);
            ops  += t/5 + t%5/2 + t%5%2;
        }
        ans = Math.min(ans, ops);
   }
           System.out.println(ans);
           }}}
