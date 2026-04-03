import random
from sys import exit

inp = input("Digite o seu nome: ")
print("Seu nome é: " + inp)

for k in range(1,11):
    print(k)
    if k > 6:
        print("Breaking loop")
        break

print("loop broken")
print("Here's a random number: " + str(random.randint(-1000,1000)))

exit()
print("this line will not be printed")