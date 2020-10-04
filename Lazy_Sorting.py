def solve(p):
    q=p[:]
    q.sort()
    if p==q:
        return 0
    l={}
    f=math.factorial(len(p))
    for i in range(len(p)):
        if p[i] in l:
            l[p[i]]=l[p[i]]+1
        else:
            l[p[i]]=1
    p=list(set(p))
    for i in range(len(p)):
        f=f/(math.factorial(l[p[i]]))
    return ("%.6f"%f)