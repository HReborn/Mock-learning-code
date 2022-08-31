import pprint

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

currentLine = blankGrid[0] #11 to 20
middle = currentLine[15:32]
firstRow = currentLine[:15]
secondRow = currentLine[17:31]
thirdRow = currentLine[32:]
for lineSelc in range(11,21):
    replacer = '012345678901234'
    blankGrid[lineSelc] = firstRow + '|' + replacer + '|' + thirdRow

pprint.pprint(blankGrid) 