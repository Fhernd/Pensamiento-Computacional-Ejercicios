// Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
// puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
// AX + BY + C = 0.

const x1 = 5;
const y1 = 10;
const x2 = 15;
const y2 = 20;

const a = y1 - y2;
const b = x2 - x1;
const c = (x1 * y2) - (x2 * y1);

console.log("La ecuación de la recta es: " + a + "X + " + b + "Y + " + c + " = 0");
