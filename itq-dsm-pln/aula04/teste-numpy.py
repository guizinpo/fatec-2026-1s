import numpy as np

vetor1 = np.array([1, 3, 5, 7, 11, 13, 17, 19, 23]).astype(np.float32)
print( "Vetor numeros primos (1D): ", vetor1)

vetor2 = np.array([ [1], [3], [5], [7], [11], [13], [17], [19], [23]])
print( "Vetor numeros primos (2D): ", vetor2)


matriz1 = np.array( [ [1, 3, 5], [7, 11, 13], [17, 19, 23] ])
print(matriz1)

print("Dimensoes Vetor1: ", vetor1.ndim)
print("Dimensoes Vetor2: ", vetor2.ndim)
print("Dimensoes Matriz: ", matriz1.ndim)


print("Shape Vetor1: ", vetor1.shape)
print("Shape Vetor2: ", vetor2.shape)
print("Shape Matriz: ", matriz1.shape)

print("Type Vetor1: ", vetor1.dtype)
print("Type Vetor2: ", vetor2.dtype)
print("Type Matriz: ", matriz1.dtype)

