Y, M, D = map(int, input().split())

# Please write your code here.

def is_yoon(Y):
    if Y % 4 == 0 and Y % 100 == 0 and Y % 400 == 0:
        return True
    elif Y % 4 == 0 and Y % 100 == 0:
        return False
    elif Y % 4 == 0:
        return True
    else:
        return False

def y_or_n(Y, M, D):
    if M == 2:
        if is_yoon(Y):
            if 1<= D <= 29:
                return True
            else:
                return False
        else:
            if 1<= D <= 28:
                return True
            else:
                return False
    elif M in (1, 3, 5, 7, 8, 10, 12):
        if 1<= D <= 31:
            return True
        else:
            return False
    elif M in (4, 6, 9, 11):
        if 1 <= D <= 30:
            return True
        else:
            return False
    else:
        return False

if y_or_n(Y, M, D):
    if 3 <= M <= 5:
        print("Spring")
    elif 6 <= M <= 8:
        print("Summer")
    elif 9 <= M <= 11:
        print("Fall")
    elif M in (12, 1, 2):
        print("Winter")
else:
    print(-1)
