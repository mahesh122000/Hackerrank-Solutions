import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int tt=s.nextInt();
    while(tt-->0)
    {long a=s.nextLong();
    long b=s.nextLong();
    int count1=0,count2=0;
    long t=a;
    while(t>0)
    {count1++;
    t=t/2;}
    t=b;
    while(t>0)
    {count2++;
    t=t/2;}
    if(count2>count1)
    {System.out.println("0");}
    else
    {int aa[]=new int[count1];
    int bb[]=new int[count2];
    
    int i=0;
    while(a>0)
    {aa[i]=(int)a%2;
    i++;
    a=a/2;}
    i=0;
    while(b>0)
    {bb[i]=(int)b%2;
    i++;
    b=b/2;}
    
    for(i=count1-1;i>=0;i--)
    {if(aa[i]==bb[i])
    {}
    else
    break;}
    while(i-->0)
    {aa[i]=0;}
  //  for(int j=0;j<count1;j++)
  //  System.out.println(aa[j]);
    long ans=0;
    for(int j=0;j<count1;j++)
    ans+=(long)Math.pow(2,j)*aa[j];
    System.out.println(ans);}
    }}}