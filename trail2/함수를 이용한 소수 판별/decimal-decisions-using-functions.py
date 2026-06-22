a, b = map(int, input().split())

# Please write your code here.

def is_Prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    
    #print(n)
    return True

sum = 0

for i in range(a, b+1):
    if is_Prime(i):
        sum = sum + i

print(sum)