import json
laminas = input()

laminasJSON = json.loads(laminas)
elemento = input().replace(" ", "")
suma = []
elementos = []

for n in elemento:
    if n in laminasJSON:
        elementos.append(n)
        value = laminasJSON[n]
        suma.append(value)

suma = sum(suma)
print(suma)

for x in elementos:
    print (str(x), end=" ")