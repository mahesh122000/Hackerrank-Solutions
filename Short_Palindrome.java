import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    String c=s.next();
    long a1[]=new long[26];
    long a2[][]=new long[26][26];
    long a3[]=new long[26];
    long mod=1000000007;
    long ans=0;
    for(int i=0;i<c.length();i++)
    {int k=(int)(c.charAt(i)-'a');
    ans=(ans+a3[k])%mod;
    ans%=mod;
    for(int j=0;j<26;j++)
    {a3[j]=(a3[j]+a2[j][k])%mod;
    a3[j]%=mod;}
    for(int j=0;j<26;j++)
    {a2[j][k]=(a2[j][k]+a1[j])%mod;
    a2[j][k]%=mod;}
    a1[k]++;
    a1[k]%=mod;
    }
    System.out.println(ans);
    }}