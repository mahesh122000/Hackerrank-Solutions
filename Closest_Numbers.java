import java.io.*;
import java.util.*;


public class Solution {
 public static void main(String[] args)
{Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=0;int y=0;
int a[]=new int[n];
int b[]=new int[2*n];
int k=0;
int min=99999999;
for(int i=0;i<n;i++)
{a[i]=s.nextInt();}
Arrays.sort(a);

for(int i=0;i<n-1;i++)
{
if(Math.abs(a[i]-a[i+1])<min)
{k=0;min=Math.abs(a[i]-a[i+1]);
b[k]=a[i];k++;b[k]=a[i+1];k++;}
else if(Math.abs(a[i]-a[i+1])==min)
{b[k]=a[i];k++;b[k]=a[i+1];k++;}
}
for(int i=0;i<k;i++)
System.out.print(b[i]+" ");}}