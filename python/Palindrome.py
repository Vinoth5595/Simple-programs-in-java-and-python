user_input = input("Enter Input:")
length = len(user_input)
reverse_output = ""

for i in range(length-1,-1,-1):
    reverse_output+=user_input[i]

if user_input.lower()==reverse_output.lower():
    print("Palindrome")
else:
    print("Not Palindrome")
