def morganAndString(a, b):
    return ''.join(morgan(a, b))
def morgan(a, b):
    a += 'z'
    b += 'z'

    for _ in range(len(a) + len(b) - 2):
        if a < b:
            yield a[0]
            a = a[1:]
        else:
            yield b[0]
            b = b[1:]