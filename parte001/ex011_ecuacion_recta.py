# Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
# puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
# AX + BY + C = 0.

# Captura de datos:
x1 = float(input("Ingrese el valor de X1: "))
y1 = float(input("Ingrese el valor de Y1: "))
x2 = float(input("Ingrese el valor de X2: "))
y2 = float(input("Ingrese el valor de Y2: "))

# Proceso:
a = y2 - y1
b = x1 - x2
c = x2 * y1 - x1 * y2

# Salida de datos:
print("El valor de A es: ", a)
print("El valor de B es: ", b)
print("El valor de C es: ", c)
