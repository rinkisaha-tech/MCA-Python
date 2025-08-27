mixed_tuple = (1,"python", 3.14)
print(mixed_tuple)

single_tuple = (5)
print(single_tuple)

nested_tuple = (1,(2,3),4)
print(nested_tuple)

# tuple unpacking
my_tup = (1, 2, 3)
a,b,c = my_tup
print(a,b,c)

# access by indexing
tup1 = (1,2,3,4,5)
print(tup1[2])

# count()
x = tup1.count(2)
print(x)

# index() used to find the index of an existing element
y = tup1.index(3)
print()