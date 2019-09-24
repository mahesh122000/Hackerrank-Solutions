import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    String c=s.next();
    long a[]=new long[c.length()];
    HashSet<Long>al=new HashSet<Long>();
    for(int i=0;i<c.length();i++)
    {a[i]=(long)((int)c.charAt(i)-(int)'a'+1);
    if(i>0 && c.charAt(i)==c.charAt(i-1))
    {a[i]=a[i-1]+(long)((int)c.charAt(i)-(int)'a'+1);}
    al.add(a[i]);}
    int n=s.nextInt();
    while(n-->0)
    {long k=s.nextLong();
    if(al.contains(k))
    System.out.println("Yes");
    else
    System.out.println("No");}}
    }