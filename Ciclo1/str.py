#concatenar
nombre = "Minch Yoda"
trabajo = "Stars War"
print(nombre + " el maestro")
print(nombre + trabajo)
print(trabajo + " " + nombre)

#comparar
print("Rojas" < "Rosas")
print("Rojas" == "rosas")

#Subindice
nombre = "Minch Yoda"
print(nombre[0]) # imprime M
print(nombre[6]) # imprime Y
print(nombre[4]) # imprime h

#Consultar una cadena
text = "cien años de soledad"
text
if "años" in text:
    print("yes")
else:
    print("no")

#Iterar una cadena
s = "hola amigos mios"
for letra in s: # se puede iterar cada letra de la cadena
    print(letra)
    
#Longitud
nombre = "Hola"
print(len(nombre))

#Slice
#La funci ́on slice obtiene una porcion (subcadena) de una cadena. La
#notacion es similar a la funcion range, [inicio:fin:incremento]. Para
#el programa

nombre = "Minch Yoda"
print(nombre[:5])
print(nombre[0:7])
print(nombre[6:10])
print(nombre[::-1])

#Count
str1 = "The avengers"
print(str1.count("e"))
print(str1.count("e", 0, 3))
print(str1.count("e", 4, len(str1)))
cad = "abcabcabcabcabc"
print(cad.count("abc"))

#Buscando find,rfind
cadena = "Bienvenidos a mi aplicacion, esto es un ensayo."
print("Primera vez que aparece la palabra: ", cadena.find("e"))
print("La ultima vez que aparece la palabra: ",cadena.rfind("e"))

#Mayusculas minusculas
s = "cien años de soledad en Macondo"
print(s.lower()) # Muestra la cadena en min ́usculas
print(s.upper()) # Muestra la cadena en may ́usculas
print(s.capitalize()) # Primer letra a may ́uscula
print(s.title()) # Primer letra cada palabra a may ́uscula
print(s.swapcase()) # May ́usculas <-> min ́usculas

#Remover caracteres 
s = "---++---cien años de soledad en Macondo---++---"
print(s.strip("-+"))
print(s.lstrip("-+"))
print(s.rstrip("-+"))

#Dividir cadenas
sdate = "01-06-2021"
sp = sdate.split("-")
print(sp)
print("dia:", sp[0], "- mes:", sp[1], "- a~no:", sp[2])

#Justificar cadenas
str1 = "Bogotá"
print(str1.ljust(15, "#"))
print(str1.rjust(15, "#"))
print(str1.center(15, "#"))
account = "123456789"
print(account.zfill(15))

#Reemplazo
str1 = "cien años de soledad"
print(str1)
rep = str1.replace("cien", "setenta")
print(rep)
rep = rep.replace("años", "días")
print(rep)
rep = rep.replace("soledad", "clases sincrónicas!")
print(rep)
