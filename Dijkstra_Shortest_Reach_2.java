import java.io.*;
import java.util.*;

public class Solution {
    static PriorityQueue<int[]>pq;
     static void dijkstra(int list[][], int src, int V)
    {
        int a[]=new int[V];
        int b[]=new int[V];
        pq=new PriorityQueue<>((p,q)->p[1]-q[1]);
        Arrays.fill(a,Integer.MAX_VALUE);
        a[src]=0;
        for(int i=0;i<V;i++)
        pq.add(new int[]{i,a[i]});
        for(int i=0;i<V;i++)
        {int u=find(a,b,V);
        b[u]=1;
        for(int j=0;j<V;j++)
        {if(b[j]==0 && list[u][j]!=0 && a[u]!=Integer.MAX_VALUE)
        {a[j]=Math.min(a[j],a[u]+list[u][j]);
        pq.add(new int[]{j,a[j]});}
        }
        }
        for(int i=0;i<V;i++)
        {if(i!=src)
        {if(a[i]==Integer.MAX_VALUE)
        System.out.print("-1 ");
        else
        System.out.print(a[i]+" ");}}
    }
    static int find(int a[],int b[], int V)
    {
        int min=Integer.MAX_VALUE;
        int i=-1;
        one:while(!pq.isEmpty())
        {int x[]=pq.poll();
        if(b[x[0]]==0)
        {min=x[1];
        i=x[0];
        pq.add(x);
        break one;}}
        return i;
    }

    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    public static void main(String[] args) throws Exception
    {
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int a[][]=new int[n][n];
            for(int i=0;i<m;i++)
            {
                st=new StringTokenizer(br.readLine());
                int p=Integer.parseInt(st.nextToken())-1;
                int q=Integer.parseInt(st.nextToken())-1;
                int r=Integer.parseInt(st.nextToken());
                if(a[p][q]>0)
                {a[p][q]=Math.min(a[p][q],r);
                a[q][p]=a[p][q];}
                else
                {a[p][q]=r;
                a[q][p]=r;}
            }
            int src=Integer.parseInt(br.readLine())-1;
            dijkstra(a,src,n);
            System.out.println();
        }
    }
}