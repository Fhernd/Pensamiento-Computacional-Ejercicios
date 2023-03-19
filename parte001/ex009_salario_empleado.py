# Se tiene la siguiente información de un empleado: 
# - código del empleado, 
# - nombres, 
# - número de horas trabajadas al mes, 
# - valor hora trabajada, 
# - porcentaje de retención en la fuente.
# Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

# Lectura de datos:
codigo = int(input("Ingrese el código del empleado: "))
nombres = input("Ingrese los nombres del empleado: ")
horas_trabajadas = int(input("Ingrese el número de horas trabajadas al mes: "))
valor_hora = float(input("Ingrese el valor de la hora trabajada: "))
porcentaje_retencion = float(input("Ingrese el porcentaje de retención en la fuente: "))

# Proceso:

# Salida de datos:
print("Código: ", codigo)
print("Nombres: ", nombres)

salario_bruto = horas_trabajadas * valor_hora
print("Salario bruto: ", salario_bruto)

salario_neto = salario_bruto - (salario_bruto * porcentaje_retencion / 100)
print("Salario neto: ", salario_neto)
