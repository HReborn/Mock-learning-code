def the_comma_code(list_variable):
    '''
    The function makes a sentence with all items from a list into a single string.
    '''    
    
    input_lenght = len(list_variable)
    string_sequence_comma = ''

    for index in range(input_lenght):
        
        str_present_list_item = str(list_variable[index]) # present item of the list

        if index == input_lenght - 1: # if it's the last item, it'll add an 'and'
            string_sequence_comma = string_sequence_comma + ' and ' + str_present_list_item + '.'
        elif index == 0: # if it's the first item, it'll set up the variable to receive the adding values
            string_sequence_comma =  str_present_list_item
        else: # if it's any other middle value besides the first and the last, it'll do the same thing "...item3, item4..." and so on 
            string_sequence_comma = string_sequence_comma + ', ' + str_present_list_item

    return string_sequence_comma

spam = ['apples', 'bananas', 'tofu', 'cats'] # hard variable. change to try other inputs to test the function.
print(the_comma_code(spam))