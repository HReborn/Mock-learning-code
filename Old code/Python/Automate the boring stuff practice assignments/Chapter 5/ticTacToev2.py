# there's 15 blank spaces in the line and 10 lines for each marker. gridHeight = 32, gridLenght = 47
# future project, make a function to generate the grid and values modifying the sizes

def gameStart():
    '''
    This function will generate the current blank grid, virtual blank grid and select each player marker.
    '''
    playerOneMarker = input('Then, by all means tell me which marker would you like the player that goes first to use. (X/O): ')
    if playerOneMarker == 'x':
        playerTwoMarker = 'o'
    elif playerOneMarker == 'o':
        playerTwoMarker = 'x'

    currentGrid = markerGridGenerator(selectiveReturn=True, marker='grid')
    virtualGrid = {'x1y1':'',
    'x2y1':'',
    'x3y1':'',
    'x1y2':'',
    'x2y2':'',
    'x3y2':'',
    'x1y3':'',
    'x2y3':'',
    'x3y3':''}

    return currentGrid, virtualGrid, playerOneMarker, playerTwoMarker

def checkWinner(virtualGrid, playerInput, playerMarker):
    '''
    Receives the virtual grid to modify it to match the current list grid and to check if there's a winner. it'll see if any win condition is met.
    '''
    # this section will modify the virtual dictionary grid to match the current grid list.
    xPosition, yPosition = inputToIntConverter(playerInput)
    gridKey = f'x{xPosition}y{yPosition}'
    virtualGrid[gridKey] = playerMarker

    # one of those below will be true if there's 3 equal markers in a line, diagonal or column
    vt = virtualGrid # abreviates to make it easier
    line1x = vt['x1y1'] == 'x' and vt['x2y1'] == 'x' and vt['x3y1'] == 'x'
    line2x = vt['x1y2'] == 'x' and vt['x2y2'] == 'x' and vt['x3y2'] == 'x'
    line3x = vt['x1y3'] == 'x' and vt['x2y3'] == 'x' and vt['x3y3'] == 'x'
    line1o = vt['x1y1'] == 'o' and vt['x2y1'] == 'o' and vt['x3y1'] == 'o'
    line2o = vt['x1y2'] == 'o' and vt['x2y2'] == 'o' and vt['x3y2'] == 'o'
    line3o = vt['x1y3'] == 'o' and vt['x2y3'] == 'o' and vt['x3y3'] == 'o'
    column1x = vt['x1y1'] == 'x' and vt['x1y2'] == 'x' and vt['x1y3'] == 'x'
    column2x = vt['x2y1'] == 'x' and vt['x2y2'] == 'x' and vt['x2y3'] == 'x'
    column3x = vt['x3y1'] == 'x' and vt['x3y2'] == 'x' and vt['x3y3'] == 'x'
    column1o = vt['x1y1'] == 'o' and vt['x1y2'] == 'o' and vt['x1y3'] == 'o'
    column2o = vt['x2y1'] == 'o' and vt['x2y2'] == 'o' and vt['x2y3'] == 'o'
    column3o = vt['x3y1'] == 'o' and vt['x3y2'] == 'o' and vt['x3y3'] == 'o'
    diag1x = vt['x1y1'] == 'x' and vt['x2y2'] == 'x' and vt['x3y3'] == 'x'
    diag2x = vt['x3y1'] == 'x' and vt['x2y2'] == 'x' and vt['x1y3'] == 'x'
    diag1o = vt['x1y1'] == 'o' and vt['x2y2'] == 'o' and vt['x3y3'] == 'o'
    diag2o = vt['x3y1'] == 'o' and vt['x2y2'] == 'o' and vt['x1y3'] == 'o'

    # if any of the above conditions is true, winner is true.
    winner = line1x or line2x or line3x or line1o or line2o or line3o or column1x or column2x or column3x or column1o or column2o or column3o or diag1x or diag2x or diag1o or diag2o

    return virtualGrid, winner

def inputToIntConverter(playerInput):
    '''
    This function will convert the input words top, middle, bottom, right, left into proper coordinates to use in the program.
    '''

    # when it receives the two words separated by a blank space
    # it'll find where that blank space is, separate those two words into two different variables
    # and then it'll convert them into coordinates
    blankPosition = playerInput.find(' ')
    yPosition = (playerInput[0:blankPosition]).lower()
    xPosition = (playerInput[blankPosition+1:]).lower()

    if xPosition.lower() == 'right':
        xPosition = 1
    elif xPosition.lower() == 'middle':
        xPosition = 2
    elif xPosition.lower() == 'left':
        xPosition = 3
    if yPosition.lower() == 'top':
        yPosition = 1
    elif yPosition.lower() == 'middle':
        yPosition = 2
    elif yPosition.lower() == 'bottom':
        yPosition = 3

    return xPosition, yPosition

def gridPrinter(currentGrid):
    '''
    Simple function to print the current grid's lines one by one
    '''
    for line in range(len(currentGrid)):
        print(currentGrid[line])
    return 

# change this function to instead of a fixed marker and grid sizes, do a variable one with constant proportions
# that match the wanted size of the user.
def markerGridGenerator(selectiveReturn=False, marker=False):
    '''
    This function will generate the markers and the grid. For now, it has fixed sizes.
    '''
    axeValue = ['               ',
    '               ',
    '  \         /  ',
    '    \     /    ',
    '      \ /      ',
    '      / \      ',
    '    /     \    ',
    '  /         \  ',
    '               ',
    '               ']
    zeroValue = ['               ',
    '               ',
    '      -  -     ',
    '   -        -  ',
    '  -          - ',
    '  -          - ',
    '   -        -  ',
    '     -   -     ',
    '               ',
    '               ']
    blankValue = ['               ',
    '               ',
    '               ',
    '               ',
    '               ',
    '               ',
    '               ',
    '               ',
    '               ',
    '               ']
    blankGrid = ['               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '-----------------------------------------------',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '-----------------------------------------------',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ',
    '               |               |               ']
    
    if selectiveReturn == True:
        if marker.lower() == 'x':
            return axeValue
        elif marker.lower() == 'o':
            return zeroValue
        elif marker.lower() == 'grid':
            return blankGrid
        else:
            return blankValue
    else:
        return axeValue, zeroValue, blankValue, blankGrid

# only function that needs to change to adapt to the variable grid size.
# the indexes used here isn't in variable mode and uses the fixed grid sizes as constants.
def gridModifier(anyGrid, markerValue, xPosition,yPosition):
    '''
    The function will place the marker into the inputted position.
    '''

    # finds the index of the strings lines and columns in the lists that corresponds to the inputted position
    # it'll translate the tictactoe's grid coordinates into indexes to use when replacing the lines
    currentXPosition = [(15*(xPosition - 1)), (15*xPosition) - 1]
    currentYPosition = [(10*(yPosition - 1) + 1) - 1, (10*yPosition) - 1]
    
    if xPosition == 2:
        # this section takes into account the grid divisor and corrects the index values
        currentXPosition[0] += 1
        currentXPosition[1] += 1  
    elif xPosition == 3:
        currentXPosition[0] += 2
        currentXPosition[1] += 2
    if yPosition == 2:
        currentYPosition[0] += 1
        currentYPosition[1] += 1
    elif yPosition == 3:
        currentYPosition[0] += 2
        currentYPosition[1] += 2

    markerLineIndex = -1
    for currentGridLineIndex in range((currentYPosition[0]), currentYPosition[1]):
        markerLineIndex += 1
        currentGridLine = anyGrid[currentGridLineIndex]
        firstRow = currentGridLine[0:15]
        secondRow = currentGridLine[16:31]
        thirdRow = currentGridLine[32:]
        lineToReplace = markerValue[markerLineIndex]

        #this section will replace line by line of the current grid with the marker lines
        if (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 1:
            anyGrid[currentGridLineIndex] = lineToReplace + '|' + secondRow + '|' + thirdRow
        elif (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 2:
            anyGrid[currentGridLineIndex] = firstRow + '|' + lineToReplace + '|' + thirdRow
        elif (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 3:
            anyGrid[currentGridLineIndex] = firstRow + '|' + secondRow + '|' + lineToReplace
        

    return anyGrid

def markerPlacer(anyGrid, marker, playerInput):
    '''
    The function will call the gridModifier function to place the marker in the position he choose
    '''
    xPosition, yPosition = inputToIntConverter(playerInput)

    if marker.lower() == 'x':
        axeValue = markerGridGenerator(True, 'x')
        modifiedGrid = gridModifier(anyGrid, axeValue, xPosition, yPosition)
    elif marker.lower() == 'o':
        zeroValue = markerGridGenerator(True, 'o')
        modifiedGrid = gridModifier(anyGrid, zeroValue, xPosition,yPosition)
    else:
        blankValue = markerGridGenerator(True, 'blank')
        modifiedGrid = gridModifier(anyGrid, blankValue, xPosition,yPosition)

    return modifiedGrid

def callToExecute():
    print()
    print('Welcome to the good and old Tic Tac Toe. The game we all loved at least once in our lives.')
    wannaPlay = input('Would you like to play a round with a friend? Y/N: ')
    if wannaPlay.lower() == 'y':
        # create the starting variables for the game to start
        currentGrid, virtualGrid, playerOneMarker, playerTwoMarker = gameStart()

    roundCounter = 0
    again = False
    while wannaPlay.lower() == 'y':

        roundCounter += 1
        if again == True:
            # after the first round, if the player wanna go again, reset the variables.
            currentGrid, virtualGrid, playerOneMarker, playerTwoMarker = gameStart()
            again = False
            roundCounter = 1

        if roundCounter % 2 == 0:
            # changes the variables according to whoose turn is now
            player = 'Player two'
            playerMarker = playerTwoMarker
        else:
            player = 'Player one'
            playerMarker = playerOneMarker

        # asks for the place to put the marker, place the marker and returns the modified grid and print the grid
        print()
        playerInput = input(f'Where do you wanna place the {playerMarker.capitalize()}? ')
        print()
        currentGrid = markerPlacer(currentGrid, playerMarker, playerInput)
        gridPrinter(currentGrid)
        virtualGrid, winner = checkWinner(virtualGrid, playerInput, playerMarker)
        isFull = not('' in virtualGrid.values())
        if winner == True:
            # if there's a winner, check who wins, display it and see if he wants to play again
            
            print()
            if player == 'Player one':
                print('Congratz!! Player one wins!')
            elif player == 'Player two':
                print('Congratz!! Player two wins!')
            print()

            wannaPlay = input('Do you wanna play again? Y/N: ')
            if wannaPlay == 'y':
                again = True
            else:
                print('Okay, then. I hope to see you again soon. Goodbye.  :)')
                print()
                continue

        elif isFull == True:
            print()
            print('Unfortunately it\'s a tie. Cheer up and try your best to win next time!')
            print()

            wannaPlay = input('Do you wanna play again? Y/N: ')
            if wannaPlay == 'y':
                again = True
            else:
                print('Okay, then. I hope to see you again soon. Goodbye.  :)')
                print()
                continue
            
callToExecute()