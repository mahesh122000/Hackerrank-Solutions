def find_gcd(x, y): 
    while(y): 
        x, y = y, x % y 
  
    return x 

def solve(a, q):
    l=[]
    num1=a[0] 
    num2=a[1] 
    f=0
    if(len(list(set(a)))==1):
        f=1
    gcd=find_gcd(num1,num2)
    for i in range(2,len(a)): 
        gcd=find_gcd(gcd,a[i])
    for j in range(len(q)):
        if(f==1):
            l.append(gcd+q[j])
        else:
            l.append(find_gcd(gcd,q[j]))
    return l