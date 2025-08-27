my_list = list(range(1,11))
first_five = my_list[:5]
print("First 5 element: ",first_five)

first_five = my_list[1::2]
print("Every second element: ",first_five)


even_odd = ['even' if x % 2 == 0 else 'odd' for x in my_list]
print(even_odd)
#  Use list comprehension to generate a list of squares of even numbers
list_comp = [x**2 for x in my_list if x%2 == 0]
print(list_comp)