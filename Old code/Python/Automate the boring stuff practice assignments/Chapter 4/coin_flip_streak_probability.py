import random

def coin_flip_result_list_generator(number_of_flips):

    coin_sides = ['H', 'T']
    coin_flip_result_list = []

    for index in range(number_of_flips): # generates a list that contains all a sequence of coin flips and store them
        present_coin_flip_result = [str(random.choice(coin_sides))]
        coin_flip_result_list = coin_flip_result_list + present_coin_flip_result # appends the present value to the already existing list till gets to the inputted number of flips

    return coin_flip_result_list

def streak_6_coin_flip_probability_checker(number_of_simulations, number_of_flips_per_simulation):
    '''
    Finds the probability of at least one six streak value in a coin flip with a inputted number of flips per simulation and a number of simulations
    '''

    streaks_of_six_counter = 0

    for simulation_index in range(number_of_simulations): # this for loop will run till the inputted number of simulations

        coin_flip_result_list = coin_flip_result_list_generator(number_of_flips_per_simulation)
        print(coin_flip_result_list)
        present_simulation_index = -1
        streak_validation = 0 # checks if there's a streak in the present simulation

        for present_coin_flip_result in coin_flip_result_list: # this for loop will run till the present simulation is over when it finds a streak or when the flips reachs the inputted number

            present_simulation_index += 1

            if present_simulation_index == 0: # prevents error from the first iteration because the loop verifies with the past value
                continue
            else:
                past_coin_flip_result = coin_flip_result_list[present_simulation_index - 1]
                if past_coin_flip_result == present_coin_flip_result and streak_validation == 0: # start of the flip streak
                    coin_flip_streak_counter = 2
                    streak_validation = 1
                elif past_coin_flip_result == present_coin_flip_result and streak_validation == 1: # if there is a streak, add 1 to the streak
                    coin_flip_streak_counter += 1
                else: # if the past value isn't the same as the present value, reset the streak validation and streak counter
                    coin_flip_streak_counter = 0
                    streak_validation = 0
        
            if coin_flip_streak_counter == 6: # the loop will break because it only needs to verify if there's at least one streak of six in a specified number of flips
                streaks_of_six_counter += 1
                break
    
    probability = 100*(streaks_of_six_counter / number_of_simulations)
    return probability

number_of_simulations = 10
number_of_flips_per_simulation = 100
probability = streak_6_coin_flip_probability_checker(number_of_simulations, number_of_flips_per_simulation)
print(f'''The probability of at least one streak of six equal faces in {number_of_flips_per_simulation} 
coin flips per simulation in {number_of_simulations} coin flip simulations is: {probability}%''')