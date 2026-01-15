import random

start = 0
finish = 10
number = random.randint(start, finish)

print("Welcome to GuessTheNumber!! You are playing with the range from " + str(start) + " to " + str(finish) + ".")
print()
change = input("Do you want to change the range of numbers? (y/n): ")
validInput = True
print()

if change not in ["Y", "N", "y", "n"]:
    print("Invalid input. Starting the game with current range of numbers.")
    validInput = False
    
if validInput and change in ["Y", "y"]:
    start = int(input("Type the start of the range: "))
    finish = int(input("Type the end of the range: "))
    number = random.randint(start, finish)
    print()
else:
    print("Ok! Starting the game with current range of numbers...")
    print()

print("Welcome to GuessTheNumber!! You are playing with the range from " + str(start) + " to " + str(finish) + ".")
print()
print("From the range of " + str(start) + " to " + str(finish) + ", ")
inp = int(input("Take a guess and type the integer i'm thinking: "))

while number != inp:
    
    if inp > number:
        print("Too high! Guess lower!")
    else:
        print("Too low! Guess higher")
        
    inp = int(input("\nWrong guess! Try again. Type a number: "))
    
print("\nCongratulations!!! You guessed righttt!!! You're awesome!!!!!")
print("The number really was " + str(number) + "!!!")