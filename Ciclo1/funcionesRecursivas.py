import math as m
#Forma no recursiva con el metodo factorial de la libreria math
def imprimir(x):
    print(m.factorial(x))
imprimir(5)

#Forma no recursiva
def factorial(n):
    r = 1
    i = 2
    while i <= n:
        r *= i
        i += 1
    return r
print(factorial(5))

#Forma recursiva
def factorialr(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)
print(factorialr(5))


def juego(intentos = 1):
    pregunta = input("¿Qué color tiene la manzana?: ")
    if pregunta != "verde":
        if intentos < 3:
            print("\n Respuesta incorrecta !! Intentalo de nuevo")
            intentos +=1
            juego(intentos)
        else:
            print("\n Has perdido!")
    else:
        print("\n Has ganado")

juego()

    