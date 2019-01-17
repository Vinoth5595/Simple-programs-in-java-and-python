user_input = int(input("Enter valid integer"))
temp1 = user_input
reverse = 0

while user_input>0:
    temp2 = int(user_input%10)
    globals()['reverse'] = (globals()['reverse']*10) + temp2
    user_input = int(user_input/10)

print(temp1)
print(reverse)
