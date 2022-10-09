#Estructura de control condicional sí (if)
# La estructura de control condicional o de seleccion permite ejecutar un grupo de instrucciones si una condicion se cumple o no


#   <bloque_prev>
#   if <cond>:
#       <bloque_V>
#   else:
#       <bloque_F>
#   <bloque_sigui>

#Ejemplo ejercicio Valor absoluto
def valor_absoluto(x):
    if x >= 0:
        valor = x
    else:
        valor = -x
    return valor
x = float(input("Ingrese un número real x: "))
valor_abs = valor_absoluto(x)
print("El valor absoluto de " + str(x), end = " ")
print("es " + str(valor_abs))

#Ejemplo maximo entre dos numeros

def maximo_dos_numeros(a, b):
    if a > b:
        return a
    else:
        return b

a = int(input("Ingrese el primer numero: "))
b = int(input("Ingrese el segundo numero: "))
print("El numero mayor es:",  maximo_dos_numeros(a, b))

#Operador condicional ternario
# <bloque_1> if <cond> else <bloque_2>
def valor_absoluto(x):
    valor = x if x >= 0 else -x
    return valor
print(valor_absoluto(-12))

#Estructura condicional sin opcion alternativa
#   <bloque_prev>
#   if <cond>:
#       <bloque>
#   <bloque_sigui>

#Ejemplo
valor = 2
if valor > 5:
    print("Se cumple la condición")

#Ejemplo 2
numero = int(input("Por favor, escriba un numero positivo: "))
if numero < 0:
    print("Numero incorrecto, por favor ingrese un numero positivo")
print(f"escribiste el numero {numero}")

#Impresion de numeros con signo
def imprimir_numero(x):
    if x >= 0.0:
        print("+", end = "")
    return x
print(imprimir_numero(3.14159265))

#El operador lógico "Condicional"
def condicional(p, q):
    if p == True and q == False:
        return False
    else:
        return True
print(condicional(True, False))

#Estructuras condicionales enlazadas

#   <bloque_prev>
#   if <cond_1>:
#       <bloque_1>
#   elif <cond_2>:
#       <bloque_2>
#   ...
#   elif <cond_i>:
#       <bloque_i>
#   ...
#   elif <cond_n-1>:
#       <bloque_n-1>
#   else:
#       <bloque_n>
#   <bloque_sigui>

#Ejemplo descuento

def pago_final(n,precio):
    if n <= 5:
        valor = n * precio
    elif n <= 10:
        valor = n * precio * 0.95
    elif n <= 20:
        valor = n * precio * 0.90
    else:
        valor = n * precio * 0.80
    return valor
print(pago_final(4,10000))
