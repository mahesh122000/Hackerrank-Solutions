 public static int find(long a[],int l,int h,long x)
    {
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]<=x)
            l=m+1;
            else
            h=m-1;
        }
        return l;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int la=s.nextInt();
        int lb=s.nextInt();
        int lc=s.nextInt();
        HashSet<Long>hs=new HashSet<>();
        for(int i=0;i<la;i++)
        {hs.add(s.nextLong());}
        la=hs.size();
        long a[]=new long[la];
        int i=0;
        for(Long k:hs)
        {a[i]=k;
        i++;}
        hs.clear();
        for(i=0;i<lb;i++)
        {hs.add(s.nextLong());}
        lb=hs.size();
        long b[]=new long[lb];
        i=0;
        for(Long k:hs)
        {b[i]=k;
        i++;}
        hs.clear();
        for(i=0;i<lc;i++)
        {hs.add(s.nextLong());}
        lc=hs.size();
        long c[]=new long[lc];
        i=0;
        for(Long k:hs)
        {c[i]=k;
        i++;}
        hs.clear();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans=0;
        for(i=0;i<lb;i++)
        {int p=find(a,0,la-1,b[i]);
        int q=find(c,0,lc-1,b[i]);
        ans+=p*q;}
        System.out.println(ans);
    }
}
