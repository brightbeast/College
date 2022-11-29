def allocation(a) :
    dict={
        0: "zero",
        1: "one",
        2: "two",
        3: "three",
        4: "four",
        5: "five",
        6: "six",
        7: "seven",
        8: "eight",
        9: "nine",
    }
    # print(dict)
    str=""
    while a>0 :
        rem=a%10
        str=dict[rem]+" "+str
        a=int(a/10)
    print(str)

a=int(input("Enter the number"))
allocation(a)