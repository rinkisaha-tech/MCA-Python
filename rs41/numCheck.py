# num=int(input("Enter a number: "))
# if(num == 0):
#     print("Number is zero...")
# elif(num > 0):
#     print("Number is positive...")
# else:
#     print("Number is negative")

def num_check(num):
    if num == 0:
        return "Zero..."
    elif num > 0:
        return "Positive"
    elif num < 0:
        return "Negative"
    else: 
        return "Invalid Input"


num = int(input("Enter a number: "))
print("This is ", num_check(num))