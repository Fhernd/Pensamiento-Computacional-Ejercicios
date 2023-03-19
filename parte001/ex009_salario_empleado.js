// Se tiene la siguiente información de un empleado: 
// - código del empleado, 
// - nombres, 
// - número de horas trabajadas al mes, 
// - valor hora trabajada, 
// - porcentaje de retención en la fuente.
// Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

const codigo = 1;
const nombres = "Juan Pérez";
const horasTrabajadas = 160;
const valorHora = 10000;

const salarioBruto = horasTrabajadas * valorHora;
const retencion = 0.1;

const salarioNeto = salarioBruto - (salarioBruto * retencion);

console.log("Código: " + codigo);
console.log("Nombres: " + nombres);
console.log("Salario bruto: " + salarioBruto);
console.log("Salario neto: " + salarioNeto);
