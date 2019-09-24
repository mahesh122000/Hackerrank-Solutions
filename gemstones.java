import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String c[]=new String[n];
    for(int i=0;i<n;i++)
    c[i]=s.next();
    int a[]=new int[26];
    for(int i=0;i<26;i++)
    a[i]=0;
    for(int j=0;j<c[0].length();j++)
    {a[(int)(c[0].charAt(j)-'a')]++;}
   // for(int i=0;i<26;i++)
   // System.out.print(a[i]+" ");
   // System.out.println();
    int b[]=new int[26];
    for(int i=0;i<26;i++)
    b[i]=0;
    for(int i=1;i<n;i++)
    {for(int j=0;j<c[i].length();j++)
    {b[(int)(c[i].charAt(j)-'a')]++;}
    for(int k=0;k<26;k++)
    {a[k]=Math.min(a[k],b[k]);
    b[k]=0;}}
   // for(int i=0;i<26;i++)
    //System.out.print(a[i]+" ");
    int count=0;
    for(int i=0;i<26;i++)
    {
    count+=a[i];}
    System.out.println(count);}
    }