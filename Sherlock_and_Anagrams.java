import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

    public static String sort(String a)
    {
        char aa[]=a.toCharArray();
        Arrays.sort(aa);
        String b=new String(aa);
        return b;
    }
    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {String c=s.next();
    int n=c.length();
    HashMap<String,Integer>hm=new HashMap<>();
    for(int i=0;i<n;i++)
    {for(int j=i;j<n;j++)
    {String a=sort(c.substring(i,j+1));
    if(hm.containsKey(a))
    {int p=hm.get(a);
    p++;
    hm.put(a,p);}
    else
    {hm.put(a,1);}
    }}
    int ans=0;
    for(Integer i:hm.values())
    ans+=(i*(i-1))/2;
    System.out.println(ans);
    }}}