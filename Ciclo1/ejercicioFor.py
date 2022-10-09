# password = "python"
# contador = 0

# while True:
#     cont = input("Ingrese su contraseña: ").lower()
#     contador += 1
#     if cont == password:
#         print("Bienvenido a la Matrix")
#         break
#     if cont != password and contador == 6:
#         print("Se ha bloqueado el ingreso por seguridad \n Fin del programa. ")
#         break

cadena = input("Ingrese una cadena: ")

contador = 0

for letra in cadena:
    if letra == "a":
        contador += 1
    elif letra == "e":
        contador += 1
    elif letra == "i":
        contador += 1
    elif letra == "o":
        contador += 1
    elif letra == "u":
        contador += 1

print(f"La cadena tiene {contador} vocales")
