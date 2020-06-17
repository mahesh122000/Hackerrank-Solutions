static boolean  misereNim(int[] s) {
        if(s.length==1)
        return s[0]>1;
        int sum=0;
        int xor=0;
        for(int i=0;i<s.length;i++)
        {
            sum+=s[i];
            xor^=s[i];
        }
        if(sum==s.length)
        {
            return sum%2==0;
        }
        return xor>0;
    }