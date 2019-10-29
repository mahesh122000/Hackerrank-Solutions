import java.io.*;
import java.util.*;


public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int c=s.nextInt();
    int m=s.nextInt();
    int ans=0;
    ans=n/c;
    int w=ans;
    while(w>=m)
    {ans+=w/m;
    int k=w/m;
    w=w%m;
    w+=k;}
    System.out.println(ans);}}