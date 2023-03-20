<?php
// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

$a = 5;
$b = 10;
$c = 15;

if ($a > $b && $a > $c) {
    echo "$a es el mayor";
} else if ($b > $a && $b > $c) {
    echo "$b es el mayor";
} else {
    echo "$c es el mayor";
}
