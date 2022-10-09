import matplotlib.pyplot as plt
import numpy as np

x = np.linspace(0, 2, 50)
#print(x)
# A ́un con el OO-style, usamos ".pyplot.figure" para crear la figura.
fig, ax = plt.subplots() # Crea la figura y los ejes.
ax.plot(x, x, label="linear") # Dibuja algunos datos en los ejes.
ax.plot(x, x**2, label="quadratic") # Dibuja mas datos en los ejes.
ax.plot(x, x**3, label="cubic") # ... y algunos m ́as.
ax.set_xlabel("x label") # Agrega un x-label a los ejes.
ax.set_ylabel("y label") # Agrega un y-label a los ejes.
ax.set_title("Simple Plot") # Agrega t ́ıtulo a los ejes.
ax.legend() # Agrega una leyenda.)