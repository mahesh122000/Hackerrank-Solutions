import java.io.*;
import java.util.*;

public class Solution {
    static Stack<Integer> data;
    static Stack<Integer> div;
    static Stack<Integer> non_div;
    static int arr[];
    static void solve(int q)
    {
        int i=0;
        int val=0;
        int p=arr[i];
        while (q-->0){
            non_div.clear();
            i++;
            while (!data.isEmpty()){
                val = data.pop();
                if (val % p == 0)
                    div.push(val);
                else
                    non_div.push(val);
            }
            if(q!=0)
            p = arr[i];
            print();
            data = (Stack<Integer>) non_div.clone();
        }
        while (!non_div.isEmpty())
            System.out.println(non_div.pop()+"");
    }
    
    static void find()
    {
        arr[0]=2;
        int k=3;
        for(int i=1;i<arr.length;)
        {if(isPrime(k))
        {arr[i]=k;
        i++;}
        k++;}
    }
    static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {if(n%i==0)
        return false;}
        return true;
    }
    static void print()
    {
        while (!div.isEmpty()){
            System.out.println(div.pop()+"");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = s.nextInt();
        data = new Stack<Integer>();
        div = new Stack<Integer>();
        non_div = new Stack<Integer>();
        arr=new int[q];
        find();
        for (int i=0; i<n; i++)
            data.push(a[i]);
        solve(q);
    }
}