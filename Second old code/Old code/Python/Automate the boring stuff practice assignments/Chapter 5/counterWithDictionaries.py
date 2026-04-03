import pprint

example_dict = {'first value':'red', 'second value': 42}
str1 = 'it\'s a new dawn, it\'s a new day, it\'s a new liiiiife for me'
count = {}
for character in str1:
    count.setdefault(character, 0)
    count[character] += 1

pprint.pprint(count)