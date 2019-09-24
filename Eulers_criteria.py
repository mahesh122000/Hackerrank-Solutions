for _ in range(int(input())):
    A,M = [int(temp) for temp in input().split()]
    if A == 0:
        print('YES')
    elif pow(A, (M - 1) // 2, M) == 1:
        print('YES')
    else:
        print('NO')