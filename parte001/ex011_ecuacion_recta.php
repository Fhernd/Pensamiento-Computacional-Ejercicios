<?php
// Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
// puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
// AX + BY + C = 0.

$x1 = 1;
$y1 = 2;
$x2 = 3;
$y2 = 4;

$a = $y2 - $y1;
$b = $x1 - $x2;
$c = $x2 * $y1 - $x1 * $y2;

echo "La ecuación de la recta es: $a x + $b y + $c = 0";
