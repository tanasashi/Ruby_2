a=range(0,50000)
c=0
for i in a:
    if (i%3==0) or ('3' in str(i)):
        c= c+1
print(c)
