a, o, c = input().split()
a = int(a)
c = int(c)

# Please write your code here.

def summ(a, b):
    print(f"{a} + {b} = {a + b}")


def Dif(a, b):
    print(f"{a} - {b} = {a - b}")

def nanu(a, b):
    print(f"{a} / {b} = {int(a / b)}")

def mult(a,b):
    print(f"{a} * {b} = {a * b}")


if o == "+":
    summ(a, c)
elif o == "-":
    Dif(a, c)
elif o == "*":
    mult(a, c)
elif o == "/":
    nanu(a, c)
else:
    print("False")