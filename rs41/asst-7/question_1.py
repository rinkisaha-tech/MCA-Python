# 1. Write a python program to:
#     a. Open a text file in write mode and write some data into it.
#     c. Close a file properly and print a message once closed.


# filename = "random.txt"

# data_to_write = "This is a random text file. \n It is created for the assignment 7."

# with open(filename, 'r+') as file:
#     c = file.write(data_to_write)
#     re = file.read()
#     print(re)
#     file.close()

# print(f"Data written successfully in the {filename}")




print("=="*20)
with open(r'E:\rs41\random.txt', 'r') as file:
    content = file.read()
    print(content)
    file.close()
print("=="*20)
print("File Closed. Visit Again.")   
#     b. Read and print the contents using the read() method.

