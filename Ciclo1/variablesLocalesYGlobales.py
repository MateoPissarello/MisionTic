#Variable local
def func():
    a=12
    print('Variable local:', a)
a=10
func()
print ('Variable del cuerpo principal:',a)

#Variable Global
k = 4
def main():
    lista = []
    def add():
        for x in range(k):
            lista.append(x)
        print(lista)
    add()

main()

#palabra reservada "global"
k=5
def func():
    global k
    k=k+7
    print("La variable k tiene alcance global:",k)
    k=10
func()
print ("Valor de la variable global k fuera de la funci ́on:",k)