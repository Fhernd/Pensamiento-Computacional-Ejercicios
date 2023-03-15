# Hacer  un  algoritmo  que,  dados  los  dos  lados  diferentes  de  un  rectángulo,  encuentre  el  perímetro y el área del mismo.

lado_1 = float(input("Ingrese el primer lado del rectángulo: "))
lado_2 = float(input("Ingrese el segundo lado del rectángulo: "))

perimetro = 2 * (lado_1 + lado_2)

area = lado_1 * lado_2

print("El perímetro del rectángulo es: ", perimetro)
print("El área del rectángulo es: ", area)
