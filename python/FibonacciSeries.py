oldVal =0
newVal = 1
input = 10
print(oldVal)
print(newVal)
for i in range(input):
    temp = newVal
    newVal = oldVal+newVal
    oldVal = temp
    print(newVal)

