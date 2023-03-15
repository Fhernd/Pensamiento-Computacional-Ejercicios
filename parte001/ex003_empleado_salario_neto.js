// Un  empleado  trabaja  48  horas  en  la  semana  a  razón  de  $70.000  hora. 
// El  porcentaje  de  retención en la fuente es del 17.5% del salario bruto.
// Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

const horasSemanales = 48;
const valorHora = 70000;
const porcentajeRetencion = 0.175;

const salarioBruto = horasSemanales * valorHora;
const retencion = salarioBruto * porcentajeRetencion;
const salarioNeto = salarioBruto - retencion;

console.log("El salario bruto es: " + salarioBruto);
console.log("La retención en la fuente es: " + retencion);
console.log("El salario neto es: " + salarioNeto);
