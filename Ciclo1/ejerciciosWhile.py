#total = 0
#numero = int(input("Ingrese numero: "))
#while numero != 0:
#    suma = numero + total
#    total += numero
#    numero = int(input("ingrese numero: "))
#print("La suma de los numeros introducidos es: ", suma)

#password = "python"
#contador = 0

# while True:
#     palabra = input("Ingresa el password: ")
#     contador+=1
#     if palabra == password:
#         break
#     elif palabra != password and contador > 7:
#       break

suma = 0
while True:
    dato = int(input("Ingrese un numero entero" + "a sumar o 0 para salir"))
    if(dato == 0):
        break
    suma += dato
    print("La suma es: " + str(suma))