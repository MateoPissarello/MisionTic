cadena = input("Ingresa una cadena: ")
cadena_al_reves = cadena[::-1]
print(cadena_al_reves)
if (cadena == cadena_al_reves):
    print("Es palindromo")
else:
    print("No es palindromo")
