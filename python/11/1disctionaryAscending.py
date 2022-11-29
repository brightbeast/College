a={
    "a": 4,
    "b": 3,
    "c": 2,
    "d": 1,
}
#items return both key and value
sort_data=dict(sorted(a.items(), key=lambda x:x[1], reverse=False))

print(a.items())
print(sort_data)
