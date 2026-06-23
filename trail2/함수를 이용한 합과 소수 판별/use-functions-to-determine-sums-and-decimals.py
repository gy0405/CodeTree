a, b = map(int, input().split())

# Please write your code here.

cnt = 0

def is_Prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def is_sum_even(n):
    cnt = 0
    while n > 0:
        cnt = cnt + n % 10
        n = n // 10
    if cnt % 2 == 0:
        return True
    else:
        return False

for i in range(a, b+1):
    if is_Prime(i) and is_sum_even(i):
        cnt = cnt + 1

print(cnt)