#         0    1   2   3   4    5
lista1 = [20, 30, 40, 50, "A", "B"]
print(lista1[4])
print(lista1)
lista1[3] = 100
print(lista1)
lista1.append( 200 )
print(lista1)


print("########### Matrizes ")
# (    ( 4, 5, 6 )
#      ( 3, 2, 1 )   )

#             0            1
#           0  1  2     0  1  2
matriz = [ [4, 5, 6], [ 3, 2, 1] ]
print("Elemento da linha 1 coluna 1: ", matriz[1][1])

# lista com valores de venda ao longo dos anos de 2024 até o mes atual
vendas_uniformes = [
#     0        1        2       3       4       5       6       7       8         9         10      11    
    12500.0, 9800.0, 11200.0, 10500.0, 9300.0, 8900.0, 9100.0, 9700.0, 10200.0, 11800.0, 13400.0, 15600.0,  # 2024
#     12        13       14      15        16      17      18      19       20       21       22      23    
    14200.0, 10800.0, 12100.0, 11500.0, 10100.0, 9600.0, 9900.0, 10400.0, 11000.0, 12600.0, 14100.0, 16700.0, # 2025
#     24        25      26    
    15300.0, 11700.0, 12900. # 2026(jan-mar)                                           
]

print("Elementos da lista (ano 2025): ", vendas_uniformes[ 12: 24: 2 ])
print("Elementos da lista (ano 2024) apenmas meses com 29 ou 30 dias: ", vendas_uniformes[ 1: 7: 2 ],\
      vendas_uniformes[8:12:2])

print("ultimos 5 elementos da lista: ", vendas_uniformes[:6])

print("do ante penultimo até o ultimo elementos da lista: ", vendas_uniformes[-3:])

print("do ante penultimo até o primeoro elemento da lista: ", vendas_uniformes[-3::-1])
print("Lista atual: ", vendas_uniformes)
print("Peguei o primeiro elemento da lista: ", vendas_uniformes.pop(0))
print("Lista atual: ", vendas_uniformes)

