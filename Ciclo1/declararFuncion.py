
#Funcion sin parametros de entrada
def suma():
    print(5 + 10)
suma()

def nuevaLinea():
    print("Linea de practica 1")
nuevaLinea()
print("Linea de practica 2")

#Funciones con un solo parametro de entrada
def potenciaDeUnNUmero(x):
    return x * x
print(potenciaDeUnNUmero(10))

def area_circulo(r):
    area = 3.14159265 * (r ** 2)
    return area
print(area_circulo(5))

#Funciones con mas de un parametro de entrada
def area_de_rectangulo(l,a):
    area = l * a
    return area
print(area_de_rectangulo(10,20))