# Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

# Lectura de datos
a = int(input("Ingrese el valor de A: "))
b = int(input("Ingrese el valor de B: "))
c = int(input("Ingrese el valor de C: "))

# Proceso
if a > b and a > c:
    print("A es mayor que B y C")
elif b > a and b > c:
    print("B es mayor que A y C")
elif c > a and c > b:
    print("C es mayor que A y B")
else:
    print("A, B y C son iguales")
