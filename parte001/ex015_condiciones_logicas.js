// Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
// correspondientes que muestren: 
// - A y B (Parte verdadera de A y parte verdadera de B).  
// - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
// - A y no B y no C. 
// - No A (y luego seguirá explorando D y, en su caso, E). 
// - No A y D y E. 
// - No A y D y no E. 
// - No A y no D. 

const a = true;
const b = false;
const c = true;
const d = true;
const e = false;

console.log("a = " + a);
console.log("b = " + b);
console.log("c = " + c);
console.log("d = " + d);
console.log("e = " + e);

console.log();

console.log("A y B: " + (a && b));
console.log("A y no B y C: " + (a && !b && c));
console.log("A y no B y no C: " + (a && !b && !c));
console.log("No A: " + !a);
console.log("No A y D y E: " + (!a && d && e));
console.log("No A y D y no E: " + (!a && d && !e));
console.log("No A y no D: " + (!a && !d));
