tuple1 = (0, 1, 2, 3)
tuple2 = ("A", "B", "C")
tuple3 = (tuple1, tuple2)
print(tuple3)
print(tuple3[0])
print(tuple3[1])
print(tuple3[1][0])

#concatenar tuplas 
tup1 = ("A", "B", "C", "E")
tup2 = (1, 2, 3, 4, 5)
tup3 = tup1 + tup2
print(tup3)

#Repetir tuplas (*)
tup2 = (1, 2, 3, 4, 5)
tup3 = tup2 * 3
print(tup3)
tup4 = ("Abc", "Bcd")
tup5 = tup4 * 2
print(tup5)

#Comparar
print(("Rojas", 123) < ("Rosas", 123))
print(("Rosas", 123) == ("rosas", 123))
print(("Rosas", 123) > ("Rosas", 23))
print(("Rojas", "123") > ("Rosas", 23))
print(("Rosas", "123") > ("Rosas", 23))

#Subindice
avengers = ("Ironman", "Thor", "Ant-man", "Hulk")
print(avengers[0])
print(avengers[3])
print(avengers[-1])
print(avengers[-3])

#Consultando
text = ("cien", "a~nos", "de", "soledad")
if "años" in text:
    print("Si est ́a en la tupla")
else:
    print("No est ́a en la tupla")

#Iterando
s = ("hola", "amigos", "mios")
for palabra in s: # para cada palabra de la tupla
    print(palabra, end = ", ")

#Asignando multiples variables
tupla = (1, -2, 3)
a, b, c = tupla
print("a =", a)
print("b =", b)
print("c =", c)

#Intercambiando variables
a = 1
b = 3
a, b = b, a
print("a =", a)
print("b =", b)

#Asignando multiples variables desde una tupla
tupla = (11, 9, -2, 3, 8, 5)
var1, var2, var3 = (tupla[i] for i in (1, 3, 5))
print("var1 =", var1, ", var2 =", var2, ", var3 =", var3)
var1, var2, var3 = (tupla[i] for i in range(0,6,2))
print("var1 =", var1, ", var2 =", var2, ", var3 =", var3)

#Tuplas y funciones
def minmax(a, b):
    if a < b:
        return a, b
    else:
        return b, a
x, y = minmax(5, 13)
print("min =", x, ",", "max =", y)
x, y = minmax(12, -4)
print("min =", x, ",", "max =", y)

#Longitud
tup = (1, 2, 3, 4)
nombre = ("Minch", "Yoda")
trabajo = ("Stars", "War", "Movie")
empty = ()
print(len(tup))
print(len(nombre))
print(len(trabajo))
print(len(empty))

#Subtuplas (slice)
avengers = ("Ironman", "Thor", "Ant-man", "Hulk")
print(avengers[:2])
print(avengers[1:3])
print(avengers[3:3])
print(avengers[::-1])

#Count (Contando)
tupla = (4, 3, 8, 8, 2, 5, 4, 6, 8, 9)
print(tupla.count(2))
print(tupla.count(8))
print(tupla.count(5))
print(tupla.count(7))

#Buscando (index)
tupla = (4, 3, 8, 8, 2, 5, 4, 6, 8, 9)
print(tupla.index(2))
print(tupla.index(8))
print(tupla.index(5))

#Maximo y minimo
t = (4, 5, -1, 6, 7)
print(max(t))
print(min(t))

#De cadena a tupla
magician = "Dumbledore"
tm = tuple(magician)
print(tm)

#Desempacar Variables
tup1 = (1, 2, 3)
a, b, c = tup1
print("a:", a, "b:", b, "c:", c)

#La funcion map

t = tuple(map(int, input(" ").split(" "))) # digite 1 2 3
print(t)
print(t[0] + t[1])