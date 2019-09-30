import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {long a=s.nextLong();
    long b=s.nextLong();
    long x=s.nextLong();
    if(a==1 && x==1)
    System.out.println("1");
    else if(b<=0)
    {System.out.println("0");}
    else
    {long ans=(long)Math.pow(a,b);
    long k=ans/x;
    long g=k*x;
    long h=(k+1)*x;
    if(Math.abs(g-ans)>Math.abs(h-ans))
    System.out.println(h);
    else
    System.out.println(g);}}}}