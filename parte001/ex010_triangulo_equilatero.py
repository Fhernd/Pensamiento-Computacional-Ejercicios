# Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
# perímetro, el valor de la altura y el área del triángulo.

# Captura de datos:
lado = float(input("Ingrese el valor del lado: "))

# Proceso:
perimetro = lado * 3
altura = lado * 0.866
area = lado ** 2 * 0.433

# Salida de datos:

print("El perímetro del triángulo es: ", perimetro)
print("La altura del triángulo es: ", altura)
print("El área del triángulo es: ", area)
