armasVampiricGhosts = input( )
armasFrenzyShooters = input( )
relojDeJuego = input( )
def ganador(V,F):
    if V > F:
        print("V", end = "" )
    elif V < F:
        print("F", end = "")
    else:
        print("≈", end ="")

puntosVampiricGhosts = 0
puntosFrenzyShooters = 0

for caracter in relojDeJuego:
    if (caracter in armasFrenzyShooters ) and (caracter in armasVampiricGhosts):
        ganador(puntosVampiricGhosts, puntosFrenzyShooters)
    else:
        if caracter in armasFrenzyShooters:
            puntosFrenzyShooters +=1
            ganador(puntosVampiricGhosts, puntosFrenzyShooters)
        elif caracter in armasVampiricGhosts:
            puntosVampiricGhosts +=1
            ganador(puntosVampiricGhosts, puntosFrenzyShooters)
        else:
            ganador(puntosVampiricGhosts, puntosFrenzyShooters)
        
