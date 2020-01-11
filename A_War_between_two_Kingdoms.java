import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     while(t-->0)
     {int n=s.nextInt();
         long a[]=new long[n];
         for(int i=0;i<n;i++)
             a[i]=s.nextLong();
         long b[]=new long[n];
         for(int i=0;i<n;i++)
             b[i]=s.nextLong();
         Arrays.sort(a);
         Arrays.sort(b);
         int count=0;
         for(int i=0,j=0;i<n && j<n;)
         {if(b[j]>=a[i])
         {i++;}
         else
         {count++;i++;j++;}}
         System.out.println(count);}}}