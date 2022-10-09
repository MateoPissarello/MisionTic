#Para pagar impuestos en Colombia debes de ser mayor de edad y tener un ingreso superior a 500000 pesos anuales, realizar 
# un programa el cual capture por teclado la edad 
# y el ingreso mensual de un usuario y le imprima si cumple con los requisitos para poder pagar impuestos.

edad  = int(input("Proporcione su edad: "))
ingresosMensuales = int(input("Proporcione sus ingresos mensuales: "))

#if edad >= 18 and ingresosMensuales > 500000:
#    print(f"Su edad es de {edad} y sus ingresos mensuales son de {ingresosMensuales}.\nCumple con los requisitos para pagar impuestos")
#else:
#    print(f"Su edad es de {edad} y sus ingresos mensuales son de {ingresosMensuales}.\nNo Cumple con los requisitos para pagar impuestos")
    

def pagarImpuestos(e,i):
    if e >= 18 and i > 500000:
        return f"Su edad es de {e} y sus ingresos mensuales son de {i}.\nCumple con los requisitos para pagar impuestos"
    else:
        return f"Su edad es de {e} y sus ingresos mensuales son de {i}.\nNo Cumple con los requisitos para pagar impuestos"

print(pagarImpuestos(edad, ingresosMensuales))