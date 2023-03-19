<?php
// Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
// semiperímetro y el área del triángulo.

$lado1 = 5;
$lado2 = 6;
$lado3 = 7;

$perimetro = $lado1 + $lado2 + $lado3;
$semiperimetro = $perimetro / 2;
$area = sqrt($semiperimetro * ($semiperimetro - $lado1) * ($semiperimetro - $lado2) * ($semiperimetro - $lado3));

echo "El perímetro del triángulo es $perimetro, el semiperímetro es $semiperimetro y el área es $area";
