n = int(input("Enter a number to check the use of break statement: "))
for i in range (n):
    if i == 7:
        break
    else:
         print(i)
a = int(input("Enter a number to check the use of continue statement: "))
for j in range (a):
    if j == 5:
        continue
    else:
        print(j)
b = int(input("Enter a number to check the use of pass statement: "))
for k in range (b):
    if k % 2 == 0 :
        print("This is even", k)
    else:
        pass