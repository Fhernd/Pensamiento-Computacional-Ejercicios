<?php
// Cierta  universidad  para  liquidar  el  pago  de  matrícula  de  un  estudiante  le  exige  los 
// siguientes datos: 
// - Número de inscripción  
// - Nombres 
// - Patrimonio. 
// - Estrato social. 
// La universidad cobra un valor constante para cada estudiante de $100.000. Si el patrimonio 
// es mayor que $4'000.000 y el estrato superior a 3, se le incrementa un porcentaje del 5% 
// sobre el patrimonio. Hacer un algoritmo que muestre: 
// - Número de inscripción. 
// - Nombres. 
// - Pago de matrícula.

$numero_inscripcion = 1;
$nombres = "Juan Pérez";
$patrimonio = 5000000;
$estrato_social = 4;

$matricula = 100000;

if ($patrimonio > 4000000 && $estrato_social > 3) {
    $matricula += $patrimonio * 0.05;
}

echo "Número de inscripción: $numero_inscripcion" . '<br>';
echo "Nombres: $nombres" . '<br>';
echo "Pago de matrícula: $matricula" . '<br>';
