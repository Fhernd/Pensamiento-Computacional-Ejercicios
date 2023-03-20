# Escribir  las  estructuras  que  calculen  y  muestren  el  valor  de  X,  de  acuerdo  con  lo 
# siguiente: 
# X = 0    si  Y < A y (A< B < C) 
# X = 1    si  A  <=  Y <  B 
# X = 2    si  B  <=  Y < C 
# X = 3    si  C  <=  Y 
# X = 4 si no se cumple ninguna de las condiciones anteriores.

# Captura de datos:
y = int(input("Ingrese el valor de Y: "))
a = int(input("Ingrese el valor de A: "))
b = int(input("Ingrese el valor de B: "))
c = int(input("Ingrese el valor de C: "))

# Proceso:
if y < a and a < b < c:
    x = 0
elif a <= y < b:
    x = 1
elif b <= y < c:
    x = 2
elif c <= y:
    x = 3
else:
    x = 4

# Salida de datos:
print("El valor de X es: ", x)
