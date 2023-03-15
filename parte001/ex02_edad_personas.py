# A la mamá de Edward le preguntan su edad, y contesta:
# Tengo 3 hijos, pregúntele a Edward su edad. Germán tiene 2/3 de la edad de Edward, 
# Daniela tiene 4/3 de la edad de Edad y mi edad es la suma de las edades de los tres.
# Calcular la edad de los cuatro.

edward_edad = int(input("Ingrese la edad de Juan: "))
german_edad = edward_edad * 2 / 3
daniela_edad = edward_edad * 4 / 3
mama_edad = edward_edad + german_edad + daniela_edad

print("La edad de Juan es: ", edward_edad)
print("La edad de Germán es: ", german_edad)
print("La edad de Daniela es: ", daniela_edad)
print("La edad de la mamá es: ", mama_edad)
