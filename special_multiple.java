import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static long ans(int n)
    {String c="";
    while(n>0)
    {int k=n%2;
    if(k==1)
    c+="9";
    else
    c+="0";
    n=n/2;}
    String d="";
    for(int i=c.length()-1;i>=0;i--)
    d+=c.substring(i,i+1);
    return (Long.parseLong(d));}


    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
   long a[]=new long[10000];
   for(int i=0;i<10000;i++)
   a[i]=ans(i+1);
    while(t-->0)
    {int n=s.nextInt();
    for(int i=0;i<10000;i++)
    {
        if(a[i]%n==0)
    {System.out.println(a[i]);
    break;}}}
     }}
