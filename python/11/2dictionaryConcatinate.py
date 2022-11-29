d1 = {1:110,2:220} 
d2 = {3:300,4:440} 
d3 = {5:550,6:660} 
d4={}
d4.update(d1)
d4.update(d2)
d4.update(d3)
d4.update(d4)
print(d4)