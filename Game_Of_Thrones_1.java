import java.io.*;
import java.util.*;


public class Solution {

   
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    String c=s.next();
    int a[]=new int[26];
    int n=c.length();
    for(int i=0;i<n;i++)
    {a[(int)(c.charAt(i)-'a')]++;}
    int count=0;
    for(int i=0;i<26;i++)
    {if(a[i]%2==1)
     count++;}
    if(count>=2)
     System.out.println("NO");
    else
     System.out.println("YES");}}