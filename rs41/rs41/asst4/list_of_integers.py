# create list-- 
# list = [1, 2, 3, 4, 5]
l1 = list(range(1,6))
print("This is our list: ", l1)

# append operation--
l1.append(41)
print("After append function: ",l1)

# insertion--
l1.insert(1,33)
print("After inserting a number: ", l1)

# updation--
l1[3]=51
print("After updation: ", l1)

# deletion by index-- 
del l1[1]
print("After deletion: ", l1)

# deletion by value-- 
l1.remove(51)
print("After deltion with value: ", l1)

# sorting 
unordered_l2 = [23, 1, 3, 90, 55]
print("Unsorted list: ", unordered_l2)
unordered_l2.sort()
print("After sorting the list: ",unordered_l2)

# reverse
rev_list = list(reversed(unordered_l2))
print("Reversed list: ",rev_list)
