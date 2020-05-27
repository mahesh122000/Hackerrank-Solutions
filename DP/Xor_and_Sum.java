def xorAndSum(a, b):
    ans=0
    x=int(a,2)
    y=int(b,2)
    for i in range(314160):
        ans+=x^(y<<i)
    return ans%1000000007