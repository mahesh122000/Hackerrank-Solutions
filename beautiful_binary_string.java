import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String c=s.next();
    char[] a=c.toCharArray();
    int count=0;
    for(int i=0;i<n-2;)
    {if(a[i]=='0'&&a[i+1]=='1'&&a[i+2]=='0')
    {count++;
    a[i+2]='1';i+=2;}
    else
    {i++;}}
    System.out.println(count);}}