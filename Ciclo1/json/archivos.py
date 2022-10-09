#Metodo para abrir un archivo y escribir en el y despues cerrarlo sin el with
f = open("files/hola.txt", "w")
f.write("hola mundo")
f.close()

#Abrir y leer un archivo
with open("files/data.txt", "r") as f: #El with open abre el archivo y cuando se termine de ejecutar lo cierra automaticamente
    data = f.read()
    print(data)

#Abrir y sobreescribir en un archivo 
with open("files/wdata.txt", "w") as f:
    data = "JIJIJA \n"
    f.write(data)
    f.write(data)
with open("files/wdata.txt", "w") as f:
    data = "Ola \n"
    f.write(data)
    f.write(data)

#Agregar contenido a un archivo existente
with open("files/wdata.txt", "a") as f:
    data = "Añadiendo texto dentro del documento :) \n"
    f.write(data)
    f.write(data)
    f.write(data)
with open("files/wdata.txt", "a") as f:
    data = "//////////////////////////////// \n"
    f.write(data)
    f.write(data)
    f.write(data)
    f.write(data)
    f.write(data)
    f.write(data)
    f.write(data)

##Agregar contenido a un archivo existente y ubicarlo en las primeras lineas
with open("files/wdata.txt", "r+") as f:
    data = "//////////////////////////////// \n"
    f.write(data)
    f.write(data)
  

#Leer un archivo por completo
with open("files/wdata.txt", "r")as f:
    print(f.read())

#Lectura de un archivo con tildes
with open("files/wdataegghgg.txt", "r") as f:
    print(f.read()) 

#Leer byte a byte
with open("files/data1.txt", "r") as f:
    linea1 = f.read(6)
    linea2 = f.read(10)
print(linea1)
print(linea2)
#Leer un archivo linea por linea readline()
with open("files/data1.txt", "r", encoding="utf-8") as f:
    linea1 = f.readline()
    linea2 = f.readline()
    linea3 = f.readline()
print(linea1, end="")
print(linea2, end="")
print(linea3, end="")

#Cargar las lıneas de un archivo como una lista
with open("files/data1.txt", "r", encoding="utf-8") as f:
    print("Nombre del archivo: ", f.name)
    lista = f.readlines()
print(lista)

#Procesar un archivo de forma eficiente
with open("files/data1.txt", "r", encoding="utf-8") as f:   
    for line in f:
        print(line, end="")
#añadir una nueva l ́ınea al final del archivo
with open("files/data2.txt", "a+", encoding="utf-8") as f:
    f.write("\nEsta es la línea 4: abcabcabc")

#Escribir datos que no son de tipo cadena en un archivo
values = [1234, 5678, 9012, 3.14159265, False]
with open("files/data3.txt", "w+") as f:
    for value in values:
        str_value = str(value)
        f.write(str_value)
        f.write("\n")

#Ubicarse en un archivo metodo seek
with open("files/data4.txt", "r", encoding="utf-8") as f:
    f.seek(11,0)
    for line in f:
        print(line, end="")

#Cantidad de bytes en un archivo, parecido al metodo len
with open("files/data4.txt", "a+") as f:
    print(f.tell()) 
#'r'	open for reading (default)
#'w'	open for writing, truncating the file first
#'x'	create a new file and open it for writing
#'a'	open for writing, appending to the end of the file if it exists
#'b'	binary mode
#'t'	text mode (default)
#'+'	open a disk file for updating (reading and writing)