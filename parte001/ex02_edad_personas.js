// A la mamá de Edward le preguntan su edad, y contesta:
// Tengo 3 hijos, pregúntele a Edward su edad. Germán tiene 2/3 de la edad de Edward, 
// Daniela tiene 4/3 de la edad de Edad y mi edad es la suma de las edades de los tres.
// Calcular la edad de los cuatro.

var edadEdward = 3;
var edadGerman = 2 * edadEdward / 3;
var edadDaniela = 4 * edadEdward / 3;
var edadMama = edadEdward + edadGerman + edadDaniela;

console.log("La edad de Edward es: " + edadEdward);
console.log("La edad de Germán es: " + edadGerman);
console.log("La edad de Daniela es: " + edadDaniela);
console.log("La edad de la mamá es: " + edadMama);
