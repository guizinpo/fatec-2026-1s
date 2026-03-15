import random
luz = False
jogando = True
while jogando:
    if not luz:
        print("Você está em um quarto escuro, e tem um armario fechado na sua frente, o que deseja fazer ?")
        print("Voce pode (acender) para acender a luz, (abrir) para abrir o armario ou (encerrar) para finalizar o jogo")
    else:
        print("você está em um quarto iluminado porém com a porta trancada")
        print("Voce pode (apagar) para apagar a luz")
    comando = input().lower()
    if comando == "abrir":
        numero = random.randint( 1, 6 )
        if numero >= 1 and numero <= 3:
            print("Saiu um monstro das profundezas do inferno e jogou acido em você")
        else:
            print("Você encontrou uma chave")
    elif comando == "acender":
        print("Você acendeu a luz, e o armario sumiu")
        luz = True
        # continue
    elif comando == "apagar":
        print("Você apagou a luz")
        luz = False
    elif comando == "encerrar":
        print("Ficou com medo né")
        # break
        jogando = False
    else:
        print("O comando que você executou não é válido")
print("Fim do jogo")



