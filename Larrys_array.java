import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    HashSet<Integer>al=new HashSet();
    int count=a[0]-1;
    al.add(a[0]);
    for(int i=1;i<n;i++)
    {int k=a[i];
    int c=0;
    for(int j=1;j<k;j++)
    {if(al.contains(j))
    c++;}
    count+=a[i]-1-c;
    al.add(a[i]);}
    if(count%2==0)
    System.out.println("YES");
    else
    System.out.println("NO");}}}