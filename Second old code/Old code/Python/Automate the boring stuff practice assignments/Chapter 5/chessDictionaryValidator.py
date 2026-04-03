import pprint, random;

def blankChessBoardGenerator():
    '''
    This function will generate a chess board with the dictionary data type with 'blank' as values and the square's positions as keys.
    '''
    alphabet = 'abcdefgh'
    numbers = [1, 2, 3, 4, 5, 6, 7, 8]
    blankChessBoard = {}
    for letter in alphabet: # the letter is the columns of the board
        for number in numbers: # the number is the line of the board
            currentSquare = letter + str(number) # it'll generate a string with the combination of a letter and a number. ex: h8, a4, e1
            blankChessBoard[currentSquare] = 'blank'

    return blankChessBoard

def filledChessBoardGenerator():
    '''
    This function will generate a chess board with the dictionary data type with the initial chess pieces on the right squares as values and the square's positions as keys.
    '''
    alphabet = 'abcdefgh'
    numbers = [1, 2, 3, 4, 5, 6, 7, 8]
    chessPieceOrder = ['Rook', 'Knight', 'Bishop', 'Queen', 'King', 'Bishop', 'Knight', 'Rook']
    filledChessBoard = {}
    for letter in alphabet:
        for number in numbers:
            currentSquare = letter + str(number)
            if number == 2: # if it's white's pawn line
                filledChessBoard[currentSquare] = 'wPawn'
            elif number == 7: # if it's black's pawn line
                filledChessBoard[currentSquare] = 'bPawn'
            elif number == 1: # if it's white's piece line
                currentIndexOfPiece = alphabet.index(letter) # finds the position of the letter from a~h in the variable alphabet to index the piece's list and find which piece to store in the board
                currentPiece = chessPieceOrder[currentIndexOfPiece]
                filledChessBoard[currentSquare] = 'w' + currentPiece
            elif number == 8: # if it's black's piece line
                currentIndexOfPiece = alphabet.index(letter)
                currentPiece = chessPieceOrder[currentIndexOfPiece]
                filledChessBoard[currentSquare] = 'b' + currentPiece
            else:
                filledChessBoard[currentSquare] = 'blank'

    return filledChessBoard

def randomlyFilledChessBoardGenerator():
    '''
    Creates a chessboard with the dictonary data type, but the pieces are randomly placed. The quantities of the pieces are also random. A true chaos chess board.
    '''
    alphabet = 'abcdefgh'
    numbers = [1, 2, 3, 4, 5, 6, 7, 8]
    randomChessBoard = {}
    possiblePieceList = ['blank', 'Rook', 'Knight', 'Bishop', 'Queen', 'King']
    possibleColors = 'wb' # white or black
    for letter in alphabet: # the letter is the columns of the board
        for number in numbers: # the number is the line of the board
            currentSquare = letter + str(number) # it'll generate a string with the combination of a letter and a number. ex: h8, a4, e1
            currentPiece = random.choice(possiblePieceList)
            currentColor = random.choice(possibleColors)
            if currentPiece != 'blank':
                randomChessBoard[currentSquare] = currentColor + currentPiece
            else:
                randomChessBoard[currentSquare] = 'blank'

    return randomChessBoard

def isValidChessBoard(inputtedChessBoard, showBugs = False):
    filledChessBoard = filledChessBoardGenerator()
    result = (filledChessBoard == inputtedChessBoard)
    bugsList = {}
    if showBugs:
        for currentSquare in filledChessBoard.keys():
            correctPiece = filledChessBoard[currentSquare]
            inputPiece = inputtedChessBoard[currentSquare]
            if inputPiece != correctPiece:
                bugsList[currentSquare] = f'Error: the correct piece is {correctPiece} instead of {inputPiece}'

    return result, bugsList

randomChessBoard = randomlyFilledChessBoardGenerator()
result, bugsList = isValidChessBoard(randomChessBoard, True)
pprint.pprint(bugsList)
print()
print(result)

