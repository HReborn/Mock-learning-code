'''
This script will simulate some pets that you'll have to fill a list with their name.
'''

pets_quantity = input('How many pets do you have? : ')
pets_quantity = int(pets_quantity)
pets_name_list = []
for pets_index in range(pets_quantity):
    input_name = input(f'Write the name of your pet number {pets_index+1}: ')
    pets_name_list = pets_name_list + [input_name]
    print(pets_name_list[pets_index])
print(pets_name_list)
