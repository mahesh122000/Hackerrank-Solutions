import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {String c=s.next();
     int n=c.length();
    String a=c.substring(0,n/2);
    String b=c.substring(n/2,n);
    if(n%2==1)
     System.out.println("-1");
    else
    {int p[]=new int[26];
     int q[]=new int[26];
     for(int i=0;i<n/2;i++)
     {p[(int)(a.charAt(i)-'a')]++;}
     for(int i=n/2;i<n;i++)
     {q[(int)(b.charAt(i-n/2)-'a')]++;}
     int count=0;
     for(int i=0;i<26;i++)
     {count+=Math.abs(p[i]-q[i]);}
     System.out.println(count/2);}}}}