import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     public static boolean check(long n)
     { 
    int p = (int)(Math.log(n) /  
                  Math.log(2)); 
    if(n==(long)Math.pow(2, p))
    return true;
    else
    return false;  
     }


     public static long pow2(long n) 
{ 
      
    int p = (int)(Math.log(n) /  
                  Math.log(2)); 
    return (long)Math.pow(2, p);  
} 


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {long n=s.nextLong();
    if(n==1)
    System.out.println("Richard");
    else
    {int count=0;
    while(n!=1)
    {if(check(n))
    {n=n/2;
    count++;}
    else
    {n=n-pow2(n);count++;}}
    if(count%2==1)
    System.out.println("Louise");
    else
    System.out.println("Richard");}}}}

