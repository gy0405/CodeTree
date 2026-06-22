a, b, c = map(int, input().split())

# Please write your code here.

def min(a, b ,c):

    if a >= b:
        if b > c:
            return c
        else:
            return b
    else:
        if a > c:
            return c
        else:
            return a

print(min(a, b, c))