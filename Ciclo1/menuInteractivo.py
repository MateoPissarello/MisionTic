while True:
    print("1 - Ingresar cadena")
    print("2 - Imprimir cadena")
    print("3 - Longitud cadena")
    print("4 - Salir \n")
    opcion = int(input("Elija la opcion que desea ejecutar: "))


    if opcion == 1:
        cadena = str(input("Ingrese Cadena: "))
    elif opcion == 2:
        print("La cadena almacenada es: ", cadena)
    elif opcion == 3:
        print("La cadena introducida tiene una longitud o tamaño de: ", len(cadena), "Caracteres")
    elif opcion == 4:
        print("Hasta pronto y Gracias")
        break
    else:
        print("Opcion incorrecta. Debe ingresar numeros 1, 2, 3, 4")
