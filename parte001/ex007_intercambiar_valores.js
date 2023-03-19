// Elabore un algoritmo que lea las variables A y B y pase el valor de A a B y de B a A. 
// Sin usar más variables.

const a = 5;
const b = 10;

console.log("a = " + a);
console.log("b = " + b);

console.log();

a = a + b;
b = a - b;
a = a - b;

console.log("a = " + a);
console.log("b = " + b);
