# Un  empleado  trabaja  48  horas  en  la  semana  a  razón  de  $70.000  hora. 
# El  porcentaje  de  retención en la fuente es del 17.5% del salario bruto.
# Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

horas = 48
valor_hora = 70000

salario_bruto = horas * valor_hora
retencion = salario_bruto * 0.175

salario_neto = salario_bruto - retencion

print("El salario bruto es: ", salario_bruto)
print("La retención en la fuente es: ", retencion)
print("El salario neto es: ", salario_neto)
