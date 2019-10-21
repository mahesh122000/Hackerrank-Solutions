import java.io.*;
import java.math.*;

import java.util.*;

public class Solution {

    public static int valid(String s,char a,char b)
    {boolean flag=true;
    int n=s.length();
    String c="";
    String d="";
    for(int i=0;i<n;i++)
    {if(i%2==0)
    c+=Character.toString(a);
    else
    c+=Character.toString(b);}
    for(int i=0;i<n;i++)
    {if(i%2==0)
    d+=Character.toString(b);
    else
    d+=Character.toString(a);}
    if(s.equals(c)||s.equals(d))
    return n;
    else
    return 0;}

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String c=s.next();
    HashSet<Character>hs=new HashSet<Character>();
    for(int i=0;i<n;i++)
    hs.add(c.charAt(i));
    int l=hs.size();
    char a[]=new char[l];
    Iterator<Character>it=hs.iterator();
    int i=0;
    while(it.hasNext())
    {a[i]=it.next();i++;}
    int max=0;
    for(i=0;i<l-1;i++)
    {for(int j=i+1;j<l;j++)
    {String cc="";
    for(int k=0;k<n;k++)
    {if(c.charAt(k)==a[i]||c.charAt(k)==a[j])
    cc+=c.substring(k,k+1);}
    //System.out.println(cc);
    int te=valid(cc,a[i],a[j]);
    if(te>max)
    max=te;}}
    System.out.println(max);}
    }
