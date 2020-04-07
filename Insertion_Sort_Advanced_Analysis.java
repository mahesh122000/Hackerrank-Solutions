import java.io.*;
import java.util.*;

public class Solution {

    public static long split(long a[],int p,int q)
    {
        long ans=0;
        if(p<q)
        {int m=(p+q)/2;
        ans+=split(a,p,m);
        ans+=split(a,m+1,q);
        ans+=merge(a,p,m,q);
        return ans;
        }
        return ans;
    }
    public static long merge(long a[],int p,int m,int q)
    {
        int n=m-p+1;
        int nn=q-m;
        long count=0;
        long l[]=new long[n+1];
        long r[]=new long[nn+1];
        l[n]=r[nn]=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        l[i]=a[p+i];
        for(int i=0;i<nn;i++)
        r[i]=a[m+i+1];
        int i=0,j=0;
        for(int k=p;k<p+n+nn;k++)
        {
            if(l[i]<=r[j])
            {a[k]=l[i];
            i++;}
            else
            {a[k]=r[j];
            count+=n-i;
            j++;}
        }
        return count;
    }
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         while(t-->0)
        {int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            long[] a = new long[n];
            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i = 0; i < n; i++) {
                long arrItem = Long.parseLong(arrItems[i]);
                a[i] = arrItem;}
                long ans=split(a,0,n-1);
                bufferedWriter.write(String.valueOf(ans));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
