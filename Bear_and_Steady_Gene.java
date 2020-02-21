import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String c=s.next();
    int a[]=new int[4];
    for(int i=0;i<n;i++)
    {if(c.charAt(i)=='A')
    a[0]++;
    else if(c.charAt(i)=='C')
    a[1]++;
    else if(c.charAt(i)=='T')
    a[2]++;
    else if(c.charAt(i)=='G')
    a[3]++;
    }
    int k=n/4;
    int sum=0;
    int b[]=new int[256];
    for(int i=0;i<4;i++)
    {if(a[i]>k)
    {int p=a[i]-k;
    sum+=p;
    char cc='a';
    if(i==0)
    cc='A';
    else if(i==1)
    cc='C';
    else if(i==2)
    cc='T';
    else
    cc='G';
   // System.out.println(cc);
    for(int j=0;j<p;j++)
    b[cc]++;
    }}
   // System.out.println(sum);
   if(sum==0)
   System.out.println("0");
   else
    {int left=0;
    int min=n;
    int count=0;
    int pp=-1,qq=-1;
    for(int right=0;right<n;right++)
    {if(--b[c.charAt(right)]>=0)
    count++;
    while(count==sum)
    {if(min>right-left+1)
    {min=right-left+1;
    pp=left;
    qq=right;}
    if(++b[c.charAt(left)]>0)
    count--;
    left++;}}
    System.out.println(min);}
    }}