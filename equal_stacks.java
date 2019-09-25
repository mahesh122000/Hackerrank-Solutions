import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int r=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[m];
    int c[]=new int[r];
    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer>s2=new Stack<Integer>();
    Stack<Integer>s3=new Stack<Integer>();
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<n;i++)
    {a[i]=s.nextInt();
    sum1+=a[i];}
    for(int i=0;i<m;i++)
    {b[i]=s.nextInt();
    sum2+=b[i];}
    for(int i=0;i<r;i++)
    {c[i]=s.nextInt();
    sum3+=c[i];}
    for(int i=n-1;i>=0;i--)
    s1.push(a[i]);
    for(int i=m-1;i>=0;i--)
    s2.push(b[i]);
    for(int i=r-1;i>=0;i--)
    s3.push(c[i]);
    while(sum1!=sum2 || sum2!=sum3 )
    {if(sum1>=sum2 && sum1>=sum3)
    {sum1-=s1.peek();
    s1.pop();}
    else if(sum3>=sum2 && sum3>=sum1)
    {sum3-=s3.peek();
    s3.pop();}
    else
    {sum2-=s2.peek();
    s2.pop();}}
    System.out.println(sum1);}
    }