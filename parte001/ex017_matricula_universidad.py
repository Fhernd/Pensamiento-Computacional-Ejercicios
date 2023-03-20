# Cierta  universidad  para  liquidar  el  pago  de  matrícula  de  un  estudiante  le  exige  los 
# siguientes datos: 
# - Número de inscripción  
# - Nombres 
# - Patrimonio. 
# - Estrato social. 
# La universidad cobra un valor constante para cada estudiante de $100.000. Si el patrimonio 
# es mayor que $4'000.000 y el estrato superior a 3, se le incrementa un porcentaje del 5% 
# sobre el patrimonio. Hacer un algoritmo que muestre: 
# - Número de inscripción. 
# - Nombres. 
# - Pago de matrícula.

# Lectura de datos:
numero_inscripcion = int(input("Ingrese el número de inscripción: "))
nombres = input("Ingrese los nombres: ")
patrimonio = float(input("Ingrese el patrimonio: "))
estrato_social = int(input("Ingrese el estrato social: "))

# Proceso:
pago_matricula = 100000
if patrimonio > 4000000 and estrato_social > 3:
    pago_matricula += patrimonio * 0.05

# Salida de datos:
print("Número de inscripción: ", numero_inscripcion)
print("Nombres: ", nombres)
print("Pago de matrícula: ", pago_matricula)
