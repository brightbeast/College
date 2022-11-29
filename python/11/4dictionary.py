n=int(input("Enter number of values "))
dict={}
#taking the key and value from the user and embedding in dictionary
for x in range(0, n):
    key=input("key ")
    value=int(input("value "))
    dict[key]=value

#printing maximum and minimum value of the dictionary
print("Maximum value is ",max(dict.values()))
print("Minimum value is ",min(dict.values()))
