import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        HashMap<String,Integer>hm1=new HashMap<>();
        HashMap<String,Integer>hm2=new HashMap<>();
        for(int i=0;i<n;i++)
        {String c=s.next();
        if(hm1.containsKey(c))
        {int k=hm1.get(c);
        hm1.put(c,++k);}
        else
        hm1.put(c,1);}
        for(int i=0;i<m;i++)
        {String c=s.next();
        if(hm2.containsKey(c))
        {int k=hm2.get(c);
        hm2.put(c,++k);}
        else
        hm2.put(c,1);}
        boolean flag=false;
        for (Map.Entry mp : hm2.entrySet()) { 
            String key = (String)mp.getKey(); 
            int value = ((int)mp.getValue());
            if(hm1.containsKey(key) && hm1.get(key)>=value)
            {}
            else
            {flag=true;break;}}
            if(flag==false)
            System.out.println("Yes");
            else
            System.out.println("No");}