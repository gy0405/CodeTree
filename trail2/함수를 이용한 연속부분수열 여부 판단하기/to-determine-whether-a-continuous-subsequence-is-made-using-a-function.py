n1, n2 = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

# Please write your code here.

def yorn(a, b, n1, n2):
    if n2 > n1:
        return False
    
    for i in range(n1 - n2 + 1):
        match = True
        for j in range(n2):
            #print(i, j)
            if a[i+j] != b[j]:
                match = False
                break
        if match:
            return True

    return False 

if yorn(a, b, n1, n2):
    print("Yes")
else:
    print("No")