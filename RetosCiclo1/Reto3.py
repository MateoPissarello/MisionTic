
entrada = str(input().upper())
entradaReemplazada = entrada.replace(",","")
longitudDeEntrada = len(entradaReemplazada)
longitudDeEntrada += 1
i = 0
countLetras = 0
contador = []
letras = []

for n in range(1,longitudDeEntrada):
    try:
        if(n>=2):
            i=i+1
        if entradaReemplazada[n] == entradaReemplazada[i]:
            countLetras +=1
        elif entradaReemplazada[n] != entradaReemplazada[i]:
            countLetras +=1
            contador.append(countLetras)
            countLetras = 0
            letras.append(entradaReemplazada[i])
            print(entradaReemplazada[i], end = " ")
    except:
        letras.append(entradaReemplazada[i])
        print(entradaReemplazada[i], end = " ")
        countLetras += 1
        contador.append(countLetras)
        
print(" ")

for a in contador:
   print(str(a)+" ",end="")






