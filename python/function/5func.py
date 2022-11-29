#Write a userdefined Python function program to take two user input, length and breadth values, depending on both the values, decide if it would form a square or a rectangle, and calculate the area of the same.
def area(l, b):
    if l==b :
        print("It if square")
        print("Area of square is ",l*l)
    else :
        print("It is rectangle")
        print("Area of rectange is ",l*b)

l=int(input("Enter the length"))
b=int(input("Enter the breadth"))
area(l,b)