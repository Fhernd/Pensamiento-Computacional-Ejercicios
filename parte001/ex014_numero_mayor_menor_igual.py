# Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
# si A es mayor, menor o igual a B.

# Lectura de datos
a = int(input("Ingrese el valor de A: "))
b = int(input("Ingrese el valor de B: "))

# Proceso
if a > b:
    print("A es mayor que B")
elif a < b:
    print("A es menor que B")
else:
    print("A es igual a B")
