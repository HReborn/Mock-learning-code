def displayInventory(inputtedInventory):
    '''
    This function will receive a dictionary simulating a fantasy game inventory with integers as values and strings as keys and it will display them.
    '''
    print()
    print('Inventory: ')
    totalSumOfItems = 0
    
    for key, value in inputtedInventory.items():
        totalSumOfItems += value
        lineToPrint = str(value) + ' ' + key
        print(lineToPrint)
    
    print('Total number of items: ' + str(totalSumOfItems))
    print()

def addToInventory(inventory, addedItems):
    '''
    This function will receive a dictionary inventory and a list data type of items to add to the inventory.
    '''
    for key in addedItems: # it will iterate with the list loot and it will transform in a key~value or use it as a key
        
        # if there isn't the key, set default as 0 and add 1
        # if the key exists, just add 1
        
        inventory.setdefault(key, 0)
        inventory[key] += 1

    return inventory


anyInventory = {'rope': 1, 'torch': 6, 'gold coin': 42, 'dagger': 1, 'arrow': 12}
displayInventory(anyInventory)
anyLootList = ['gold coin', 'dagger', 'gold coin', 'gold coin', 'ruby']
modifiedInventory = addToInventory(anyInventory, anyLootList)
breakContinueVerifier = (input('Do you wanna continue to the next part? Y/N : ')).lower()
if breakContinueVerifier == 'y':
    displayInventory(modifiedInventory)