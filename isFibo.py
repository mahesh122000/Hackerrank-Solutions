#!/bin/python3

import math
import sys

t=int(input())
for i in range(t):
    n=int(input())
    k=int(math.sqrt(5*n*n+4))
    kk=int(math.sqrt(5*n*n-4))
    if(k*k==5*n*n+4 or kk*kk==5*n*n-4):
        print("IsFibo")
    else:
        print("IsNotFibo")