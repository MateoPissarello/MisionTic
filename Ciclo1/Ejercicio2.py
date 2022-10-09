#Realizar un programa que pida al usuario un numero entero y muestre por pantalla si es par o impar


#if numero % 2 == 0:
#    print(f"El número {numero} es par")
#else:
#    print(f"El número {numero} es impar")

numero = int(input("Proporcione un número entero: "))

def numeroPar(n):
    if n % 2 == 0:
        return f"El numero {n} es par"
    else:
        return f"El número {n} es impar"
        
print(numeroPar(numero))