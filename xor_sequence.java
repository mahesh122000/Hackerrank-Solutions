import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   public static long ans(long x)
   {long a = x % 8;
    if(a == 0 || a == 1) return x;
    if(a == 2 || a == 3) return 2;
    if(a == 4 || a == 5) return x+2;
    if(a == 6 || a == 7) return 0;
    return 0;
   }
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {long l=s.nextLong();
    long r=s.nextLong();
    long sum=0;
    sum=ans(r)^ans(l-1);
    System.out.println(sum);}}}
