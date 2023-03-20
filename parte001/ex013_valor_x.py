# Escribir las estructuras que calculen y muestren el valor de X de acuerdo a lo siguiente: 
# X = 1 si  Y > Z 
# X = 2 si  Y <= Z

# Captura de datos:
y = int(input("Ingrese el valor de Y: "))
z = int(input("Ingrese el valor de Z: "))

# Proceso:
if y > z:
    x = 1
else:
    x = 2

# Salida de datos:
print("El valor de X es: ", x)
