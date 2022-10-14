a=input("Enter number of elements")
li=[]
for i in range(0, int(a)):
    li.insert(i,input("Enter element"))

print(max(li))