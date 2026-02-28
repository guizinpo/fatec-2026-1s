import random
print("J O G O  D E  D A D O S")
# print("Digite um numero entre 1 e 6")
numero = -1
while numero < 1 or numero > 6:
    numero = int( input("Digite um numero entre 1 e 6: ") )
numero_sorteado = random.randint(1, 6)

print("Foi sorteado o numero: ", numero_sorteado)
if (numero == numero_sorteado):
    print("Congratulações você acertou o número do dado")
else:
    print("Que pena você errou o numero do dado")