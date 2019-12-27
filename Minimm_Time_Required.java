import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {
   
    public static void main(String[] args)
    {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         long g=s.nextLong();
         long a[]=new long[n];
         for(int i=0;i<n;i++)
         a[i]=s.nextInt();
         Arrays.sort(a);
         long max = a[n- 1];
         long minDays = 0;
         long maxDays = max*g;
         long ans = -1;
         while (minDays < maxDays) {
            long mid = (minDays + maxDays) / 2;
            long unit = 0;
            for (long i: a) {
                unit += mid / i;
            }
            if (unit < g) {
                minDays = mid+1;
            } else {
                ans= mid;
                maxDays = mid;
            }
        }
         System.out.println(ans);}}