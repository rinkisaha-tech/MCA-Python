n = int(input("Enter the number: "))
if(n > 85 ):
    print("Your grade is A.")
elif(n<=85 and n>=75):
    print("Your grade is B.")
elif(n<75 and n>=50):
    print("Your grade is C.")
elif(n<50 and n>=30):
    print("Your grade is D.")
else:
    print("You are fail.")