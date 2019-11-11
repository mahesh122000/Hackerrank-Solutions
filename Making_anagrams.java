import java.io.*;
import java.util.*;


public class Solution {

    
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    String a=s.next();
    String b=s.next();
    int c1[]=new int[26];
    int c2[]=new int[26];
    for(int i=0;i<a.length();i++)
    {c1[(int)(a.charAt(i)-'a')]++;}
    for(int i=0;i<b.length();i++)
    {c2[(int)(b.charAt(i)-'a')]++;}
    int ans=0;
     for(int i=0;i<26;i++)
     {ans+=c1[i]+c2[i]-2*Math.min(c1[i],c2[i]);}
     System.out.println(ans);}
    }