def fib(a):
    print("0")
    print("1")
    first=0
    second=1
    sum=0
    index=2
    while index<a :
        sum=first+second
        first=second
        second=sum
        print(sum)
        index+=1




num=int(input("Enter the number"))
fib(num)