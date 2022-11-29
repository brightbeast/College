conduct=int(input("Enter the number of class conducted "))
attend=int(input("Enter the number of class attended "))
percent=float((attend/conduct)*100)

print("Percentage of attendance is ",percent)

if percent<75 :
    print("Not allowed")
else :
    print("Allowed")
    
