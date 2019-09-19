import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    int count=0;
    Arrays.sort(a);
    int k=a[0];
   one: for(int i=0;i<n;)
    {while(a[i]<=k+4 && i<n)
    {//System.out.print(i+" ");
    i++;
    if(i==n)
    {count++;break one;}}
    if(i<n)
   { k=a[i];
  // System.out.println(k+" ");
    count++;}}
   System.out.println(count);
    }}