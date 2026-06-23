a, b = map(int, input().split())

# Please write your code here.

#짝수가 아님, 일의 자리가 5가 아님, 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수가 아님

cnt = 0

def not_five(n):
    if n % 10 == 5:
        return False
    return True

def not_39(n):
    if n % 3 == 0 and n % 9 != 0:
        return False
    return True

for i in range(a, b+1):
    if not_five(i) and not_39(i) and i % 2 == 1:
        #print(i)
        cnt = cnt + 1

print(cnt)