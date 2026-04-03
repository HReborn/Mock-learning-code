import time, sys
# convert the input value with int()
# even - > number // 2
# odd -> collatz() - > print and return 3*number+1
# loop till it's one and keep printing
# if number % 2 == 0,, it's even.

# add try and except to block inputs other than numbers
# if a float, print a warning saying that it'll get only the integer part.

def collatz(number):
    '''Description'''
    number = 3*number+1
    return number

def collatz_simulation(number):
    while True:
        if number == 1:
            sys.exit()
        elif number%2 == 0:
            number //= 2
        else:
            number = collatz(number)
        print(number)

def veryfier(input_value):
    '''If it's zero, asks to input again, if it\'s not numbers only, if it\'s float send a warning'''
    if input_value == 0:
        return 0
    try:
        int(input_value)
    except ValueError:
        return 1

    
print('Welcome, dear guest.  :>')
time.sleep(1.5)
print('You\'ll now be entering a simulation program.')
time.sleep(1.5)
print('Enjoy the collatz sequence, the simplest impossible math problem.')
time.sleep(1.5)
input_value = input('Please input any number: ')
if zer
number = int(input_value)
collatz_simulation(number)
print('finished!')