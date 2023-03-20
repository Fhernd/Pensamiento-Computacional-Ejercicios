# Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
# correspondientes que muestren: 
# - A y B (Parte verdadera de A y parte verdadera de B).  
# - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
# - A y no B y no C. 
# - No A (y luego seguirá explorando D y, en su caso, E). 
# - No A y D y E. 
# - No A y D y no E. 
# - No A y no D. 

# Captura de datos:
a = bool(int(input("Ingrese el valor de A: ")))
b = bool(int(input("Ingrese el valor de B: ")))
c = bool(int(input("Ingrese el valor de C: ")))
d = bool(int(input("Ingrese el valor de D: ")))
e = bool(int(input("Ingrese el valor de E: ")))

# Proceso:
# - A y B (Parte verdadera de A y parte verdadera de B).
print("A y B: ", a and b)

# - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).
print("A y no B y C: ", a and not b and c)

# - A y no B y no C.
print("A y no B y no C: ", a and not b and not c)

# - No A (y luego seguirá explorando D y, en su caso, E).
print("No A: ", not a)

# - No A y D y E.
print("No A y D y E: ", not a and d and e)

# - No A y D y no E.
print("No A y D y no E: ", not a and d and not e)

# - No A y no D.
print("No A y no D: ", not a and not d)
