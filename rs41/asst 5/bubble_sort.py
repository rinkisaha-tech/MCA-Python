u_imp = input("Enter the numbers: ")

list1 = list(map(int,u_imp.split()))
print("Unsorted list: ",list1)

n = len(list1)
for i in range(n):
    for j in range(0, n-i-1):
        if list1[j] > list1[j+1]:
            list1[j], list1[j+1] = list1[j+1], list1[j]

    print(list1)