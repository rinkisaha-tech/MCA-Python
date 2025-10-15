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


# 2. Open a file in different modes (r, w, a, r+) and print file attributes like:
#     a. name, mode, closed, readable(), writable().



file_name = 'random.txt'


modes = ['r', 'w', 'a', 'r+']

for mode in modes:
    print(f"\nOpening file in mode '{mode}':")
    file = open(file_name, mode)

    print(f"Name: {file.name}")
    print(f"Mode: {file.mode}")
    print(f"Closed: {file.closed}")
    print(f"Readable: {file.readable()}")
    print(f"Writable: {file.writable()}")

    file.close()
    print(f"Closed after closing: {file.closed}")


# 3. Write a program to:
#     a. Create a file named student.txt
#     b. Add student name and marks.
#     c. Append additional student records without overwrite existing content.
'''
# For check purpose
with open('student.txt', 'r') as file:
    content = file.read()
    print(content)
'''
    
def student_db():
    """
    Manages student records by creating a file, adding initial data,
    and allowing the user to append more records.
    """
    file_name = "student.txt"

    # a. Create and write initial records
    with open(file_name, 'w') as file:
        file.write("Student Name,Marks\n")  # Header
        # b. Add some initial student names and marks
        file.write("Manish,40\n")
        file.write("Avik,38\n")
        print(f"File '{file_name}' created with initial student data.")

    # c. Append additional student records based on user input
    while True:
        try:
            # Get user input for student details
            student_name = input("Enter student name (or 'q' to quit): ")
            if student_name.lower() == 'q':
                break

            marks = int(input(f"Enter marks for {student_name}: "))

            # Append the new record to the file
            with open(file_name, 'a') as file:
                file.write(f"{student_name},{marks}\n")
            print(f"Record for {student_name} added successfully.")

        except ValueError:
            print("Invalid input. Please enter a valid number for marks.")

    print("Student record management complete.")

# Run the program
student_db()