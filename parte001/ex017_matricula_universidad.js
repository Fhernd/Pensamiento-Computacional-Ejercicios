// Cierta  universidad  para  liquidar  el  pago  de  matrícula  de  un  estudiante  le  exige  los 
// siguientes datos: 
// - Número de inscripción  
// - Nombres 
// - Patrimonio. 
// - Estrato social. 
// La universidad cobra un valor constante para cada estudiante de $100.000. Si el patrimonio 
// es mayor que $4'000.000 y el estrato superior a 3, se le incrementa un porcentaje del 5% 
// sobre el patrimonio. Hacer un algoritmo que muestre: 
// - Número de inscripción. 
// - Nombres. 
// - Pago de matrícula.

const numeroInscripcion = 1;
const nombres = "Juan Pérez";
const patrimonio = 4000000;
const estrato = 4;

const valorMatricula = 100000;

const porcentaje = 0.05;

const pagoMatricula = valorMatricula + (patrimonio > 4000000 && estrato > 3 ? patrimonio * porcentaje : 0);

console.log("Número de inscripción: " + numeroInscripcion);
console.log("Nombres: " + nombres);
console.log("Pago de matrícula: " + pagoMatricula);
