import java.io.*;
import java.util.*;


public class Solution {
   
   public static int ans(int n,int p,int x)
   {if((int)Math.pow(x,p)<n)
   return ans(n,p,x+1)+ans(n-(int)Math.pow(x,p),p,x+1);
   else if((int)Math.pow(x,p)==n)
   return 1;
   else
   return 0;}

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        System.out.println(ans(n,p,1));
    }}