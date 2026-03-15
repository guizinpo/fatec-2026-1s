import random
print("Bem vindo ao - bandido de um braço só")

print("Informe o valor da aposta ==> ")
aposta = int(input())
random.seed( 1000 )
if aposta < 100:
    numero_isca = random.randint(2, 8)
    coluna1 = random.randint(numero_isca - 1, numero_isca + 1)
    coluna2 = random.randint(numero_isca - 1, numero_isca + 1)
    coluna3 = random.randint(numero_isca - 1, numero_isca + 1)
    print( coluna1, coluna2, coluna3 )
else:
    coluna1 = random.randint(1, 9)
    coluna2 = random.randint(1, 9)
    coluna3 = random.randint(1, 9)
    print( coluna1, coluna2, coluna3 )