def add(a,b):
    print("Addition of 2 number is ",a+b)
def sub(a,b):
    print("Subtraction of 2 number is ",a-b)
def mul(a,b):
    print("Multiplication of 2 number is ",a*b)
def div(a,b):
    print("Division of 2 number is ",a/b)

a=int(input("Enter the first number"))
b=int(input("Enter the second number"))
choice=int(input("Enter the choice 1)add, 2)sub, 3)mul, 4)div"))

if(choice==1):
    add(a,b)
elif(choice==2):
    sub(a,b)
elif(choice==3):
    mul(a,b)
elif(choice==4):
    div(a,b)
    