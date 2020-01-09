import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        String c=s.next();
        int a[]=new int[c.length()-k+1];
        int ans[]=new int[c.length()-k+1];
        for(int i=0;i<c.length()-k+1;i++)
        {a[i]=(int)c.charAt(i)%48;
        if(i==0)
        ans[i]=a[i];
        else if(i<k)
        ans[i]=a[i]^a[i-1];
        else
        ans[i]=a[i]^a[i-1]^ans[i-k];}
        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]);
    }}