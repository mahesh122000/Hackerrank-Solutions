import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   public static long gcd(long a,long b)
   {if(a==0)
   return b;
   if(b==0)
   return a;
   if(a>b)
   return gcd(b,a%b);
   else
   return gcd(a,b%a);}

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    long tta=0,taa=0;
    if(a+b>c)
    {tta=(long)Math.pow(c,2);
    taa=2*a*b;
    if(c-a>0)
    {tta=tta-(long)Math.pow((c-a),2);
    }
    if(c-b>0)
    {tta=tta-(long)Math.pow((c-b),2);}
    long val=gcd(tta,taa);
    tta=tta/val;
    taa=taa/val;
    }
    else
    {tta=taa=1;}
    System.out.println(tta+"/"+taa);
    }}}