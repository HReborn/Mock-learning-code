import random

play = True
win = 0
loss = 0
draw = 0
ROCK = "ROCK"
PAPER = "PAPER"
SCIZOR = "SCIZOR"
choices = [ROCK, PAPER, SCIZOR]
print("Welcome to rock, paper, scizor.")
print()
while play:
    comMove = choices[random.randint(0,2)]
    playerMove = ""
    
    while playerMove not in choices:
        try:
            playerInput = int(input("Press the keys 1, 2 or 3 for: Rock(1), Paper(2) or Scizor(3): "))
            print()
            playerMove = choices[playerInput-1]
            print("Player picked: " + playerMove)
        except:
            print("Wrong input, try again!")
        
         
    print("COM picked: " + comMove)
    
    rockVsScizor = playerMove == ROCK   and comMove == SCIZOR
    paperVsRock = playerMove == PAPER  and comMove == ROCK 
    scizorVsPaper = playerMove == SCIZOR and comMove == PAPER
    
    if rockVsScizor or paperVsRock or scizorVsPaper:
        print()
        print("Result: WIN!!!")
        print()
        win+=1
    elif playerMove == comMove:
        print()
        print("Result: DRAW!!!")
        print()
        draw+=1
    else:
        print()
        print("Result: LOSS!!!")
        print()
        loss+=1
        
    print("Here's the scoreboard: ")
    print("Wins: " + str(win) + " / Draws: " + str(draw) + " / Losses: " + str(loss))
    print()
    
    playInput = input("Do you wanna play another round? Press 'y' or 'n':  ")
    if playInput in ["y", "Y"]:
        print("Okay!! Let's go another round then!!")
        play = True
    elif playInput in ["n", "N"]:
        print("That's a shame... We'll see you maybe some other time. Stay well.")
        play = False
    else:
        play = False
        print("Invalid input, we'll play more some other time.")
        
    
    print()