<?php
// Se tiene la siguiente información de un empleado: 
// - código del empleado, 
// - nombres, 
// - número de horas trabajadas al mes, 
// - valor hora trabajada, 
// - porcentaje de retención en la fuente.
// Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

$codigo = 1;
$nombres = "Juan Pérez";
$horas_trabajadas = 160;
$valor_hora = 2000;
$porcentaje_retencion = 10;

$salario_bruto = $horas_trabajadas * $valor_hora;
$salario_neto = $salario_bruto - ($salario_bruto * $porcentaje_retencion / 100);

echo "Código: $codigo" . '<br>';
echo "Nombres: $nombres" . '<br>';
echo "Salario bruto: $salario_bruto" . '<br>';
echo "Salario neto: $salario_neto" . '<br>';
