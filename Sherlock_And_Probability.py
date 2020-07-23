def gcd(a, b):
    if a == 0:
        return b
    return gcd(b%a, a)


def solve(n, k, s):

    number_success = s.count('1')
    if number_success == 0:
        return "0/1"
    
    for i, char in enumerate(s):
        if char != "1":
            continue
        else:
            number_success = 2 * s[i+1:i+k+1].count("1") + number_success
    
    x = gcd(number_success, n*n)
    
    return f'{number_success//x}/{(n*n)//x}'