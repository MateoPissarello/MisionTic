#Hecho por Mateo Pissarello Londoño
pesoChavo = int(input("Proporcione un numero entero que represente el peso del Chavo: "))
pesoQuico = (pesoChavo * 2) + 4
pesoÑoño = (pesoChavo + pesoQuico) // 5

etapa = None

if pesoÑoño >= 0 and pesoÑoño < 20:
    etapa = ("uno")
elif pesoÑoño >= 21 and pesoÑoño < 40:
    etapa = ("dos")
elif pesoÑoño >= 41 and pesoÑoño < 80:
    etapa = ("tres")
else:
    etapa = ("cuatro")
    
print(f"{pesoChavo} {pesoQuico} {pesoÑoño}")
print(etapa)
    


