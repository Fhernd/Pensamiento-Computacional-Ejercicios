// Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud 
// de la circunferencia.

const radio = 5;
const pi = Math.PI;

const area = pi * radio * radio;
const longitud = 2 * pi * radio;

console.log("El área del círculo es: " + area);
console.log("La longitud de la circunferencia es: " + longitud);
