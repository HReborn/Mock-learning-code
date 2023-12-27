import random

play = True
win = 0
loss = 0
draw = 0
choices = ["Rock", "Paper", "Scizor"]
print("Welcome to rock, paper, scizor.")
print()
while play:
    comPlay = choices[random.randint(1,3)]
    playerInput = 0
    while playerInput not in [1, 2, 3]:
        try:
            playerInput = int(input("Rock(1), Paper(2) or Scizor(3)? : "))
        except:
            print("Wrong input, try again!")
        
        print("You escolheu: " + choices())
    
    
    
    playInput = input("Do you wanna play another round? (y/n): ")
    if playInput in [y, Y]:
        print("Okay!! Let's go another round then!!")
        play = True
    elif playInput in [n, N]:
        print("That's a shame... We'll see you maybe some other time. Stay well.")
        play = False
    else:
        play = False
        print("Invalid input, we'll play more some other time.")
        
    print()
    print("Wins: " + str(win) + "Draws: " + str(draw) + "Losses: " + str(loss))
    print()