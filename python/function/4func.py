#factorial using recursive
def fact(a):
    if a<2 :
        return a
    factorial=a*fact(a-1)
    return factorial

num=int(input("Enter the number"))
print("The factorial of the number is",fact(num))