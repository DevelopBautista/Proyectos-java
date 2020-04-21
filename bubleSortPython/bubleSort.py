a=[9,2,3,1,5,4,6,8,7]
for j in range(len(a)):
    swapped = False
    i = 0
    while i<len(a)-1:
        
        if a[i]>a[i+1]:
           
            a[i],a[i+1] = a[i+1],a[i]
           
            swapped = True
        i+=1
   
    if swapped == False:
        break
print (a)
