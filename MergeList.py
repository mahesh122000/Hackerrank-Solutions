# cook your dish here
#!/bin/python3

import os
import sys

# Complete the solve function below.
def modFact(n, ): 
    result = 1
    for i in range(1, n + 1): 
        result = (result * i) 
  
    return result 
if __name__ == '__main__':
    

    t = int(input())

    for t_itr in range(t):
        nm = input().split()

        n = int(nm[0])

        m = int(nm[1])
        k=1000000007
        result = (modFact(n+m)//modFact(n)//modFact(m))%k
        print(result)