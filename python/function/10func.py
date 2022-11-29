#A penality is charged for returning book late in the library.
def penalty(a):
    if a >0 and a<=5 :
        print("Penalty is 50 rupees")
    elif a>5 and a<=10 :
        print("Penalty is 100 rupees")
    elif a>10 and a<=30 :
        print("Penalty is 500 rupees")
    else :
        print("Membership is cancelled")

days=int(input("Enter the number of late days "))
penalty(days)