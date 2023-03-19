# Elabore un algoritmo que lea las variables Ay B y pase el valor de A a B y de B a A. 
# Sin usar más variables.

a = int(input("Ingrese el valor de A: "))
b = int(input("Ingrese el valor de B: "))

a, b = b, a

print("El valor de A es: ", a)
print("El valor de B es: ", b)
