# Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
# semiperímetro y el área del triángulo.

# Captura de datos:
lado1 = float(input("Ingrese el valor del lado 1: "))
lado2 = float(input("Ingrese el valor del lado 2: "))
lado3 = float(input("Ingrese el valor del lado 3: "))

# Proceso:
perimetro = lado1 + lado2 + lado3
semiperimetro = perimetro / 2
area = (semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)) ** 0.5

# Salida de datos:
print("El perímetro del triángulo es: ", perimetro)
print("El semiperímetro del triángulo es: ", semiperimetro)
print("El área del triángulo es: ", area)
