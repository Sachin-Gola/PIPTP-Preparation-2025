def function(a,b):
    for c in range(2,5):
        if(a%2 < b%3):
            a=4%3
        else:
            if(5%3>b):
                a=b
            b=1
    return a+b

print(function(2,3))