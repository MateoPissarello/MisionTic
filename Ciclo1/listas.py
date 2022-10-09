#Anidar listas
lista1 = [0, 1, 2, 3]
lista2 = ["A", "B", "C"]
lista3 = [lista1, lista2]
print(lista3)
print(lista3[0])
print(lista3[1])
print(lista3[1][0])

#Concatenar
list1 = ["A", "B", "C", "E"]
list2 = [1, 2, 3, 4, 5]
list3 = list1 + list2
print(list3)

#extend: El m ́etodo extend agrega una lista al final de otra lista, la operaci ́on
#afecta la lista invocante. Para el programa
nombres = ["Antonio", "María", "Mabel"]
otros_nombres = ["Barry", "John", "Guttag"]
nombres.extend(otros_nombres)
print(nombres)
print(otros_nombres)

#Repetir
list1 = [1, 2, 3, 4, 5]
list2 = list1 * 3
print(list2)
list3 = ["Abc", "Bcd"]
list4 = list3 * 2
print(list4)

#Comparacion
print(["Rojas", 123] < ["Rosas", 123])
print(["Rosas", 123] == ["rosas", 123])
print(["Rosas", 123] > ["Rosas", 23])
print(["Rosas", "123"] > ["Rosas", "23"])
print(("Rosas", "123") > ("Rosas", 23))

#Subindice
avengers = ["Ironman", "Thor", "Ant-man", "Hulk"]
print(avengers[0])
print(avengers[3])
print(avengers[-1])
print(avengers[-3])

#Consultar
text = ["cien", "años", "de", "soledad"]
if "años" in text:
    print("Si está en la lista")
else:
    print("No está en la lista")

#Iterar una lista
s = ["hola", "amigos", "mios"]
for palabra in s: # para cada palabra de la lista
    print(palabra, end = ", ")

#Ciclo for
d = 10
desplaza = [d + x for x in range(5)]
print(desplaza)
potencias = [3 ** x for x in range(2, 6)]
print(potencias)

#Asignando multiples variables
lista = [1, -2, 3]
a, b, c = lista
print("a =", a)
print("b =", b)
print("c =", c)

lista = [11, 9, -2, 3, 8, 5]
var1, var2, var3 = [lista[i] for i in (1, 3, 5)]
print("var1 =", var1, ", var2 =", var2, ", var3 =", var3)
var1, var2, var3 = [lista[i] for i in range(0, 6, 2)]
print("var1 =", var1, ", var2 =", var2, ", var3 =", var3)

#Listas y funciones
def minmax(a, b):
    if a < b:
        return [a, b]
    else:
        return [b, a]
x, y = minmax(5, 13)
print("min =", x, ",", "max =", y)
x, y = minmax(12, -4)
print("min =", x, ",", "max =", y)

#Longitud
lista = [1, 2, 3, 4]
nombre = ["Minch", "Yoda"]
trabajo = ["Stars", "War", "Movie"]
empty = []
print(len(lista))
print(len(nombre))
print(len(trabajo))
print(len(empty))

#Cambiar elementos en una lista
lista = ["E", "l", "m", "e", "j", "o", "r"]
lista[0] = "e"
print(lista)
lista[4] = "l"
print(lista)
lista[-1] = "s"
print(lista)

#Agregar elementos al final de la lista
nombres = ["Antonio", "Johan"]
nombres.append("Monica")
print(nombres)
nombres.append("Maria")
print(nombres)
nombres.append("Mabel")
print(nombres)

#Insertar elementos en una posicion deseada
nombres = ["Antonio", "Johan", "Maria"]
nombres.insert(0, "Guttag")
print(nombres)
nombres.insert(2, "Peter")
print(nombres)
nombres.insert(len(nombres)//2, 10)
print(nombres)

#Remover elementos
lista = ["a", "e", "i", "o", "u", "i", "x"]
lista.remove("x")
print(lista)
lista.remove("i")
print(lista)
lista.remove("i")
print(lista) 

#Slice
avengers = ["Ironman", "Thor", "Ant-man", "Hulk"]
print(avengers[:2])
print(avengers[1:3])
print(avengers[3:3])
print(avengers[::-1])

#Contando
lista = [4, 3, 8, 8, 2, 5, 4, 6, 8, 9]
print(lista.count(2))
print(lista.count(8))
print(lista.count(5))
print(lista.count(7))

#Buscando
lista = [4, 3, 8, 8, 2, 5, 4, 6, 8, 9]
print(lista.index(2))
print(lista.index(8))
print(lista.index(5))

#Maximo y minimo
t = [4, 5, -1, 6, 7]
print(max(t))
print(min(t))

#Ordenando
lista = [4, 5, -1, 6, 7]
lista.sort()    # De menor a mayor
print(lista)
lista.sort(reverse = True)  # De mayor a menor
print(lista)

#Convertir a lista
magician = "Dumbledore"
lm = list(magician)
print(lm)
t = (1, 2, 3, 4)
lt = list(t)
print(lt)

#Remover en una posicion
nombres = ["Antonio","Johan","Monica","Mar ́ıa","Mabel"]
nombres.pop(1) #remueve a Johan
print(nombres)
nombre_borrado = nombres.pop() # remueve a Mabel
print(nombre_borrado + " ha sido eliminada de la lista.")
print(nombres)