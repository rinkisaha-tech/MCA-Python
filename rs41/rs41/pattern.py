n = int(input("Enter the number: "))
for i in range(1,n+1):
    for j in range(i):
        print("*",end = " ")
    print()

# reverse pattern

m = int(input("enter a number: "))
for k in range(m,0,-1):
    for l in range(k):
        print("*", end=" ")
    print()