<?php
// Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
// perímetro, el valor de la altura y el área del triángulo.

$lado = 5;

$perimetro = 3 * $lado;
$altura = sqrt($lado * $lado - ($lado / 2) * ($lado / 2));
$area = $lado * $altura / 2;

echo "El perímetro del triángulo es $perimetro, la altura es $altura y el área es $area";
