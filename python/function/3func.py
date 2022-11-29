# Take a string from the user and count and display the number of capital and small characters in the string.
def check(str):
    countUpper=0
    countLower=0
    index=0

    while index<len(str) :
        if str[index].isupper():
            countUpper=countUpper+1
        elif str[index].islower() :
            countLower=countLower+1

        index=index+1
    
    print("Number of upper case ",countUpper)
    print("Number of lower case ",countLower)

str=input("Enter the string")
check(str)