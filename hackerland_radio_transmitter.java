import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

    
    public static void main(String[] args)
{Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
Arrays.sort(a);
int count=0;
for(int i=0;i<n;)
{count++;
int b=a[i];
b+=k;
i++;
if(i>=n)
{break;}
int count1=0;
while(a[i]<=b)
{i++;count1++;
if(i>=n)
break;}
if(count1>=1)
{i--;
    if(i<n)
{int c=a[i];
c+=k;
while(a[i]<=c)
{i++;
if(i>=n)
break;}}}
}
System.out.println(count);
}}