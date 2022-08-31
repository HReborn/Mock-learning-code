import time
# a function here to generate a grid based on the user preference
# i won't do it bc i didn't have the time lol
grid = [['.', '.', '.', '.', '.', '.'],
        ['.', 'O', 'O', '.', '.', '.'],
        ['O', 'O', 'O', 'O', '.', '.'],
        ['O', 'O', 'O', 'O', 'O', '.'],
        ['.', 'O', 'O', 'O', 'O', 'O'],
        ['O', 'O', 'O', 'O', 'O', '.'],
        ['O', 'O', 'O', 'O', '.', '.'],
        ['.', 'O', 'O', '.', '.', '.'],
        ['.', '.', '.', '.', '.', '.']]

# grid[y][x] x is the column and y is the line

line_lenght = len(grid)
column_lenght = len(grid[0]) # the columns lenght must all be the same
for column in range(column_lenght):
    present_line = '' # creates the present line to print and reset the already printed past line
    for line in range(line_lenght): # keeps the column the same and changes the line to transform the grid's columns into lines to print column by column till the image is ready
        present_grid_position = grid[line][column]
        present_line += present_grid_position + ' ' 
    print(present_line)
    time.sleep(0.5)