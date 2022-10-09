def tipodefigurita (lista):
    listaVacia = []
    for elemento in lista:
        if elemento in listaVacia:
            continue
        else:
            listaVacia.append(elemento)
    return listaVacia

def mefaltandeltipodefigurita(x,y,z):
    listaVacia = []
    for numero in x:
        if y[numero] == z:
            listaVacia.append(numero)
    return listaVacia
    
def notengo(lista1,lista2):
    listaVacia = []
    for elemento in lista1:
        if (elemento in lista1) and (elemento in lista2):
            continue
        else:
            listaVacia.append(elemento)
    return listaVacia

def puedocambiar(lista1,lista2):
    count = 0
    if len(lista1) >= len(lista2):
        for elemento in lista2:
            if (elemento in lista2) and (elemento in lista1):
                continue
            else:
                count +=1
    elif len(lista1) < len(lista2):
        for elemento in lista1:
            if (elemento in lista2) and (elemento in lista2):
                continue
            else:
                count +=1
    return count

