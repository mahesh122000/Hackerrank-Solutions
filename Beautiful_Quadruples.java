import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        long a[]=new long[4];
        for(int i=0;i<4;i++)
        a[i]=s.nextLong();
        Arrays.sort(a);
        HashMap<Long,Long>hm=new HashMap<>();
        long val=0;
        for(long i=1;i<=a[2];i++)
        {for(long j=i;j<=a[3];j++)
        {val++;
        hm.put(i^j,hm.getOrDefault(i^j,(long)0)+1);}}
        long ans=0;
        for(long i=1;i<=a[1];i++)
        {for(long j=1;j<=Math.min(i,a[0]);j++)
        {ans+=val-hm.get(i^j);}
        for(long k=i;k<=a[3];k++)
        {
        hm.put(i^k,hm.getOrDefault(i^k,(long)0)-1);
        val--;
        }}
        System.out.println(ans);
    }
} 