print("\n*********** Bienvenidos a la pizzeria MinTic ***********")
print("\n**************** Menu de Opciones ***************")
print("\n\t1- Vegana\n\t2- Pizza especial\n")
tipo = input("Por favor elija una opción: ")

if tipo == "1":
    print("\nElija el ingrediente extra que desea en su pizza: \n\t1- Pimiento\n\t2- Tofu")
    ingrediente = input("Por favor ingrese su opcion a elegir: ")
    print("Pizza vegana con mozzarella, tomate y", end = " ")
    if ingrediente == "1":
        print("pimiento...Saliendo!")
    else:
        print("Tofu...Saliendo!")
else:
    print("\nElija el ingrediente que desea en su pizza especial: \n\t1- Pepperoni\n\t2- Jamon\n\t3- Pollo desmechado")
    ingrediente = input("Introduce el ingrediente que deseas: ")
    print("Pizza especial con mozzarella, tomate y", end = " ")
    if ingrediente == "1":
        print("pepperoni...Saliendo!")
    elif ingrediente == "2":
        print("jamon...Saliendo!")
    else:
        print("pollo desmechado...Saliendo!")
