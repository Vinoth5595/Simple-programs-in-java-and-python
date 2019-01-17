#Function to check whether it is prime number or not.
#        if prime
#            return true;
#        else
#            return false;
def isPrime(n):
    if n<2:
        return False
    for j in range(2,n):
        if n%j==0:
            return False

    return True

#To check whether it is main class or not
if(__name__=="__main__"):
    #Get input from user as integer
    user_input = int(input("Enter the number to find the number of prime numbers:"))
    for i in range(1,user_input):
        if isPrime(i):
            print(i)
