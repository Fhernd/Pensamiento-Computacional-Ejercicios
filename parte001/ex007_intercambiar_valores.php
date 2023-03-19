// Elabore un algoritmo que lea las variables A y B y pase el valor de A a B y de B a A. 
// Sin usar más variables.

<?php

$a = 5;
$b = 10;

echo "a = $a, b = $b";

$a = $a + $b;
$b = $a - $b;
$a = $a - $b;

echo "a = $a, b = $b";
