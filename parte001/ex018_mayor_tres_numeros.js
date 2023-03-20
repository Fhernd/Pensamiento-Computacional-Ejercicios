// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

const numero1 = 5;
const numero2 = 10;
const numero3 = 15;

if (numero1 > numero2 && numero1 > numero3) {
    console.log("El número " + numero1 + " es el mayor.");
} else if (numero2 > numero1 && numero2 > numero3) {
    console.log("El número " + numero2 + " es el mayor.");
} else if (numero3 > numero1 && numero3 > numero2) {
    console.log("El número " + numero3 + " es el mayor.");
} else {
    console.log("Los tres números son iguales.");
}
