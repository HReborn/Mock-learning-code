import time, sys

'''
This program will execute the collatz sequence.
It's a simple math problem that returns 3*number+1 if the input is odd or returns number//2 if the input is even.
The sequence reaches it's end when the final result gets to 1.
Any integer value will eventually get to one using this method.
'''

def user_input_validation(number):
    '''
    if the input is a string or zero, enter a loop to get a valid integer input. equivalent to int(number).
    '''
    time.sleep(1.0)
    input_is_valid = 0
    while input_is_valid != 1:
        try:
            number = int(number)
            if number == 0:
               number = input('Please input a valid numeric value that isn\'t zero: ')
            else:
                input_is_valid = 1
        except ValueError:
            number = input('Input a valid numeric value: ')
            time.sleep(1.0)
    return number

def collatz(number):
    ''' 
    If the number is even, it'll call this, divide by two and return the result.
    '''
    number = number // 2
    return number

def collatz_simulation(number):
    '''
    Executes the collatz simulation
    If number is even, divide by two and return the result.
    If number is odd, multiply by 3, add one and return the result.
    '''
    print(number)
    while number != 1:
        if (number%2) == 0:
            number = collatz(number)
            print(number)
        else:
            number = 3*number + 1
            print(number)
        time.sleep(0.5)

    time.sleep(1.0)
    print('''
The simulation has reached it\'s end. Thanks for coming.
    ''')

    # section that determines wether the simulation will continue or not

    time.sleep(1.0)
    repeat_simulation_verifier = input('Would you like to do the simulation one more time? Y/N: ')
    time.sleep(1.0)

    # Input validation from the answer needed.

    while (repeat_simulation_verifier.lower() != 'y' and repeat_simulation_verifier.lower() != 'n'): # if the answer isn't equal to y or n, do the loop to get one of these options.
        time.sleep(1.0)
        print('''
Input one of the two available choices, please.''')
        time.sleep(0.5)
        repeat_simulation_verifier = input('Would you like to continue the simulation? Y/N: ')
        time.sleep(0.5)
    
    # This section will verify the user answer and return a value to continue the simulation or not. 

    if repeat_simulation_verifier.lower() == 'y':
        repeat_simulation_verifier = 2
        return repeat_simulation_verifier
    else:
        repeat_simulation_verifier = 0
        return repeat_simulation_verifier
    
print('''
Welcome, dear guest.''')
time.sleep(1.5)
print('You\'ll now be entering the collatz simulation.')
time.sleep(1.5)
print('''Enjoy the simplest impossible math problem.
''')
time.sleep(1.5)

repeat_simulation_verifier = 1 

while repeat_simulation_verifier != 0: # while the user don't say no to trying again, run the simulation again

    if repeat_simulation_verifier == 2: # if the user said yes to try again
        print('''
Thanks for trying it again.
''')
        time.sleep(1.5)

    number = input('Please input a number of your choice to begin the simulation: ')
    time.sleep(1.5)
    number = user_input_validation(number) # it'll see if the input isn't zero or a string variable to continue the program.
    print('''
Please be patient, preparing the simulation.''')
    time.sleep(1.5)
    print(f'''Done preparing. The simulation for the number {number} will start now. 
    ''')
    time.sleep(1.5)
    repeat_simulation_verifier = collatz_simulation(number)

print('''
Thank you for trying this wonderful math simulation.''')
time.sleep(1.0)
print('''Please come again.
''')
time.sleep(1.0)