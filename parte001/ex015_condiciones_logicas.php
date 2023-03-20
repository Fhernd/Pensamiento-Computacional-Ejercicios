<?php
// Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
// correspondientes que muestren: 
// - A y B (Parte verdadera de A y parte verdadera de B).  
// - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
// - A y no B y no C. 
// - No A (y luego seguirá explorando D y, en su caso, E). 
// - No A y D y E. 
// - No A y D y no E. 
// - No A y no D. 

$a = true;
$b = false;
$c = true;
$d = true;
$e = false;

if ($a && $b) {
    echo "A y B";
} else if ($a && !$b && $c) {
    echo "A y no B y C";
} else if ($a && !$b && !$c) {
    echo "A y no B y no C";
} else if (!$a) {
    echo "No A";
    if ($d) {
        echo " y D";
        if ($e) {
            echo " y E";
        }
    } else {
        echo " y no D";
    }
} else if (!$a && $d && $e) {
    echo "No A y D y E";
} else if (!$a && $d && !$e) {
    echo "No A y D y no E";
} else if (!$a && !$d) {
    echo "No A y no D";
}
