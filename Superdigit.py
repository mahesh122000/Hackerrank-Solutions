def superDigit(n, k):
    n=int(n)
    n=n*k
    x=n%9
    if(x==0):
        return 9
    else:
        return x
