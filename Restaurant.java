import java.io.*;
import java.util.*;


public class Solution {

  
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int a=s.nextInt();
    int b=s.nextInt();
     int ans=Integer.MAX_VALUE;
    for(int i=1;i<=Math.min(a,b);i++)
    {if((a*b)%(i*i)==0 && a%i==0 && b%i==0)
    {ans=Math.min(ans,(a*b)/(i*i));}}
    System.out.println(ans);}}}