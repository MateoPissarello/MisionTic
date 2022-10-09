
import numpy as np
a = np.array(list(range(1,5))) # Crea un arreglo lineal
print(type(a)) # Imprime "<class ’numpy.ndarray’>"
print(a)
print(a.shape) # Imprime "(4,)" es de tamaño 4, de 1 dimension(nos da el tamaño de la matriz en fila x columna)
print("-----------------------------")
print(a[0], a[1], a[2])
a[0] = -4
print(a)
print("-----------------------------")
b = np.array([[1,2,3,5,6],[4,5,6,7,8]]) # Crea un arreglo 2-dimensional
print(b.shape)
print(b)
print("-----------------------------")
b[0,0] = 1590
print(b)
print(b[0,0], b[0,1], b[1,0])


a = np.zeros((2,3,4))

# Crea una matriz 3-dimensional (2x3x4) de ceros (0’s)

print(a.shape)
print(a)
print("---------")
b = np.ones((2,3)) # Crea una matriz de 2x3 de unos (1’s)
print(b.shape)
print(b)
print("---------")



# Crea un arreglo 2-dimensional con forma (3, 4)
a = np.array([[1,2,3,4], [5,6,7,8], [9,10,11,12]])
print(a.shape)
print(a)
b = a[:2, 1:3]
# El primer argumento indica las filas y el segundo las columnas
print(b)
print("------------------------")
# Si se modifica algo de b, se cambia algo de a
b[0, 0] = -11 # b[0, 0] es el mismo a[0, 1]
print(b)
print(a)
print(a[0,1]) # Imprime "-11"


import numpy as np
x = np.array([5, -4])
print(x.dtype)
x = np.array([1.0, 2.0])
print(x.dtype)
x = np.array([5, -4], dtype=np.int32)
print(x.dtype)

import numpy as np
x = np.array([[1,2,5], [3,4,6]], dtype=np.float128)
y = np.array([[5,6,-1], [7,8,-6]], dtype=np.float128)
print("Suma:")
print(x + y)
print("-----")
print(np.add(x, y))
print("raiz cuadrada:")
print(np.sqrt(x))