# l1 = [1,3,7,8,18,5,9]
# print("Unsorted list: ",l1)

# for i in range(len(l1)):
#     min = i
#     print(min)
#     for j in range(i+1, len(l1)):
#         if l1[j] < l1[min]:
#             min = j

#     print(f"Before swapping l1: ",l1[i]," min: ",l1[min])
#     l1[i],l1[min] = l1[min],l1[i]
#     print(f"after swapping l1: ",l1[i]," min: ",l1[min])

# print("After performing selection sort: ", l1)


#using user input
u_imp = input("Enter the numbers: ")
print(type(u_imp[0]))

list1 = list(map(int,u_imp.split()))
print(type(list1[0]))
print("Unsorted list: ",list1)

for i in range(len(list1)):
    min = i
    for j in range(i+1, len(list1)):
        if list1[j] < list1[min]:
            min = j
            list1[i],list1[min] = list1[min],list1[i]
            print("After performing selection sort: ", list1)