import java.io.*;
import java.util.*;

public class Solution {
    static HashMap<Integer,ArrayList<Integer>>hm;
    static HashSet<Integer>hs;
    static class Node
    {
        int i;
        Node an;
        Node(int i,Node an)
        {
            this.i=i;
            this.an=an;
        }
    }
    public static int find()
    {
        int a[]=new int[101];
        Queue<Integer>q=new LinkedList<>();
        Queue<Node>qq=new LinkedList<>();
        qq.add(new Node(1,null));
        q.add(1);
        a[1]=1;
        Node goal=null;
        one:while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {int i=q.poll();
            Node no=qq.poll();
            if(i==100)
            {goal=no;
            break one;}
            ArrayList<Integer>al=hm.get(i);
            for(Integer n:al)
            {if(a[n]==0)
            {q.add(n);
            qq.add(new Node(n,no));
            a[n]=1;}}}
        }
        int count=0;
        if(goal==null)
        return -1;
        while(goal.an!=null)
        {//System.out.print(goal.i+" ");
        if(hs.contains(goal.i))
        {}
        else
        count++;
        goal=goal.an;}
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
           int n=s.nextInt();
           int a[][]=new int[n][2];
           hs=new HashSet<>();
           for(int i=0;i<n;i++)
           {a[i][0]=s.nextInt();
           a[i][1]=s.nextInt();
           hs.add(a[i][1]);}
           int m=s.nextInt();
           int b[][]=new int[m][2];
           for(int i=0;i<m;i++)
           {b[i][0]=s.nextInt();
           b[i][1]=s.nextInt();
           hs.add(b[i][1]);}
           hm=new HashMap<>();
           for(int i=1;i<=100;i++)
           {ArrayList<Integer>al=new ArrayList<>();
           hm.put(i,al);
           for(int j=1;j<=6 && i+j<=100;j++)
           {hm.get(i).add(i+j);
           }}
           for(int i=0;i<n;i++)
           {hm.get(a[i][0]).add(a[i][1]);
           }
           for(int i=0;i<m;i++)
           {ArrayList<Integer>al=new ArrayList<>();
           al.add(b[i][1]);
           hm.put(b[i][0],al);}
           System.out.println(find());
        }
    }
}