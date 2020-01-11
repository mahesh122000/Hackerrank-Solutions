'''
Mehta is a very lazy boy. He always sleeps in Maths class. One day his teacher catches him sleeping and tells him that she would mark him absent for the whole semester. While she pretends to be strict, she is actually very kind-hearted. So she wants to give Mehta a chance to prove himself. She gives him a problem. If Mehta can answer it correctly, she will forgive him. Can you help Mehta find the answer to this problem?
The problem: The teacher gives Mehta a number  and asks him to find out the probability that any proper divisor of would be an even perfect square.
Note: Even perfect square means the number should be even and a perfect square.
Input Format 
The first line of input contains an integer , the number of test cases. 
 lines follow, each line containing , the number that the teacher provides.

'''

import math
from fractions import Fraction


def solve(n):
    divisors = [1]
    for i in range(2, int(math.sqrt(n))+1):
        if n%i == 0:
            divisors.append(i)
            if(n//i != i):
                divisors.append(n//i)
    divisors.sort()
    count = 0
    for i in divisors:
        if i%2==0 and math.sqrt(i)==math.ceil(math.sqrt(i)):
            count+=1
    if count == 0:
        return "0"
    else:
        return str(Fraction(count,len(divisors)))



t=int(input())
for i in range(t):
    n=int(input())
    print(solve(n));