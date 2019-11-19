import java.io.*;
import java.util.*;


public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int p=s.nextInt();
    int n=s.nextInt();
    HashSet<Integer>hs=new HashSet<Integer>();
   // ArrayList<Integer>al=new ArrayList<Integer>();
     int count=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {a[i]=s.nextInt();
    hs.add(a[i]);
    if(p%2==0 && a[i]==p/2)
     count++;}
   one: for(int i=0;i<n;i++)
    {int k=p-a[i];
     if(k==p/2 && count<=1)
     {}
    else
    {if(hs.contains(k))
    {for(int j=i+1;j<n;j++)
    {if(a[j]==k)
    {i++;j++;System.out.println(i+" "+j);break one;}}}}}}}}