def check(a,b,c) :
    a2=a*a
    b2=b*b
    c2=c*c

    if a2==b2+c2 or b2==c2+a2 or c2==a2+b2 :
        print("It is right angled trinangle ")
    else :
        print("It is not right angled triangle")


a=int(input("Enter the length a "))
b=int(input("Enter the length b "))
c=int(input("Enter the length c "))
check(a,b,c)
