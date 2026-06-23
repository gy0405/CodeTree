M, D = map(int, input().split())

# Please write your code here.

def y_or_n(M, D):
    if M == 2:
        if 1<= D <= 28:
            return "Yes"
        else:
            return "No"
    elif M in (1, 3, 5, 7, 8, 10, 12):
        if 1<= D <= 31:
            return "Yes"
        else:
            return "No"
    elif M in (4, 6, 9, 11):
        if 1 <= D <= 30:
            return "Yes"
        else:
            return "No"
    else:
        return "No"

answer = y_or_n(M, D)

print(answer)