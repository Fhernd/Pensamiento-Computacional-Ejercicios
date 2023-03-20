// Escribir  las  estructuras  que  calculen  y  muestren  el  valor  de  X,  de  acuerdo  con  lo 
// siguiente: 
// X = 0    si  Y < A y (A< B < C) 
// X = 1    si  A  <=  Y <  B 
// X = 2    si  B  <=  Y < C 
// X = 3    si  C  <=  Y 
// X = 4 si no se cumple ninguna de las condiciones anteriores.

const y = 5;
const a = 10;
const b = 20;
const c = 30;

let x = 0;

if (y < a && a < b && b < c) {
    x = 0;
} else if (a <= y && y < b) {
    x = 1;
} else if (b <= y && y < c) {
    x = 2;
} else if (c <= y) {
    x = 3;
} else {
    x = 4;
}

console.log("x = " + x);
