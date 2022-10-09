#Realizar un programa en el cual el usuario ingrese su edad y muestre por pantalla si es mayor de edad o no

edad = int(input("Proporcione su edad:"))

#if edad >= 18:
#    print("Eres mayor de edad")
#else:
#    print("Eres menor de edad")

def mayorDeEdad(edad):
    if edad >= 18:
        return "Eres mayor de edad"
    else:
        return "Es menor de edad"

print(mayorDeEdad(edad))