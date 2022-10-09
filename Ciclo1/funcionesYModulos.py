
#Funciones sin argumentos

def saludar():
    nombre = input()
    print("Hola", nombre)
saludar()

#Funciones con argumentos y sin valor de retorno
def saludar(nombre):
    print('Hola', nombre)

nombre = input()
saludar(nombre)

#Funciones con argumentos y valor de retorno
def saludar(nombre):
    return 'Hola' + nombre
nombre = input()
print(saludar(nombre))

#Funcion con argumentos por defecto
def log_entero(num, base=2):
    cont = 0
    while num >= base:
        cont+=1
        num /= base
    return cont

print(log_entero(1024))
print(log_entero(1000,10))
print(log_entero(9,3))

#Funciones con número de argumentos variable: Tupla
def variable_argument(var1, *vari): #con un asteristo el programa identifica que va a recibir una tupla
    print('salida:'+ str(var1))
    for var in vari:
        print(var)
variable_argument(60)
variable_argument(100, 90, 67, 23, 10)

#Funciones con número de argumentos variable: Diccionario
from pprint import pprint
def informar(**var):
    pprint(var)
    for key, value in var.items():
        pprint("%s == %s" %(key,value))

informar(nombre="Poseid ́on",edad=6000,ciudad="Olimpo")

#https://pythontutor.com