# there's 15 blank spaces in the line and 10 lines for each marker. gridHeight = 32, gridLenght = 47
# future project, make a function to generate the grid and values modifying the sizes
import pprint

def gridPrinter(currentGrid):
    for line in range(len(currentGrid)):
        print(currentGrid[line])
    return 

def converterWordPosition(xPosition, yPosition):
    # converts the words into the positions
    print(yPosition)
    print(xPosition)
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

def markerGridGenerator(selectiveReturn=False, marker=False):
    
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

def gridModifier(anyGrid, markerValue, xPosition,yPosition):
    modifiedGrid = anyGrid
    markerValue = markerValue
    print(xPosition)
    print(yPosition)
    currentXPosition = [(15*(xPosition - 1)), (15*xPosition) - 1]
    currentYPosition = [(10*(yPosition - 1) + 1) - 1, (10*yPosition) - 1]
    # the section below takes into account the grid divisor and corrects the index values
    if xPosition == 2:
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
        if (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 1:
            anyGrid[currentGridLineIndex] = lineToReplace + '|' + secondRow + '|' + thirdRow
        elif (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 2:
            anyGrid[currentGridLineIndex] = firstRow + '|' + lineToReplace + '|' +thirdRow
        elif (yPosition == 1 or yPosition == 2 or yPosition == 3) and xPosition == 3:
            anyGrid[currentGridLineIndex] = firstRow + '|' + secondRow + '|' + lineToReplace
        

        #markerLineIndex += 1
        #modifiedGrid[currentGridLine][currentXPosition[0]:currentXPosition[1]] = markerValue[markerLineIndex]

    return modifiedGrid

def markerPlacer(anyGrid, marker, xPosition,yPosition):

    xPosition, yPosition = converterWordPosition(xPosition, yPosition)
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
    
def createVariableFromInput (playerInput):
    # if it is 'top middle' will return 3
    # then x = [0:3] y = [3+1:]
    blankPosition = playerInput.find(' ')
    yPosition = (playerInput[0:blankPosition]).lower()
    xPosition = (playerInput[blankPosition+1:]).lower()

    return xPosition, yPosition


print()
print('Welcome to the good and old Tic Tac Toe. The game we all loved at least once in our lives.')
wannaPlay = input('Would you like to play a round with a friend? Y/N: ')
if wannaPlay.lower() == 'y':
    currentGrid = markerGridGenerator(selectiveReturn=True, marker='grid')
    playerOneMarker = input('Then, by all means tell me which marker would you like the player that goes first to use. (X/O): ')
    if playerOneMarker == 'x':
        playerTwoMarker = 'o'
    elif playerOneMarker == 'o':
        playerTwoMarker = 'x'

while wannaPlay.lower() == 'y':
    print()
    playerOne = input(f'Where do you wanna place the {playerOneMarker.capitalize()}? ')
    if playerOne == '':
        print('The player one gives up the fight.')
        print('The winner is player two. Congratz!')
        break
    xPosition, yPosition = createVariableFromInput(playerOne)
    print()
    currentGrid = markerPlacer(currentGrid, playerOneMarker, xPosition, yPosition)
    gridPrinter(currentGrid)
    print()
    playerTwo = input(f'Where do you wanna place the {playerTwoMarker.capitalize()}? ')
    if playerTwo == '':
        print('The player two gives up the fight.')
        print('The winner is player one. Congratz!')
        break
    xPosition, yPosition = createVariableFromInput(playerTwo)
    print()
    currentGrid = markerPlacer(currentGrid, playerTwoMarker, xPosition, yPosition)
    gridPrinter(currentGrid)


#modifiedGrid = markerPlacer(anyGrid, 'x', 1,2)

#pprint.pprint(modifiedGrid)