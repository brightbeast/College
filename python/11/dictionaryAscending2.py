a={
    "a": 4,
    "b": 3,
    "c": 2,
    "d": 1,
}

sort_data=sorted(a.items(), key=lambda x:x[1], reverse=False)

print(sort_data)