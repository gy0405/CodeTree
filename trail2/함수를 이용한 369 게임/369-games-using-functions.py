a, b = map(int, input().split())

# Please write your code here.

def is_3(a, b):
    sum = 0

    for i in range(a, b+1):
        if i % 3 == 0:
            sum = sum + 1
    return sum

def is_369(a, b):
    sum = 0

    for i in range(a, b+1):
        if i % 3 != 0:
            while i >= 10:
                if i % 10 == 3 or i % 10 == 6 or i % 10 == 9:
                    sum = sum + 1
                    break
                i = i // 10

            if i == 3 or i == 6 or i == 9:
                sum = sum + 1
 

    return sum

print(is_3(a,b) +is_369(a,b))