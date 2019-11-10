import java.io.*;
import java.util.*;


public class Solution {

   
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
     k=k%n;
    int q=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
     a[i]=s.nextInt();
     int j=0;
    for(int i=n-k;i<n;i++,j++)
    {b[j]=a[i];}
     for(int i=0;i<n-k;i++,j++)
         b[j]=a[i];
    for(int i=0;i<q;i++)
    {int p=s.nextInt();
    System.out.println(b[p]);}}}