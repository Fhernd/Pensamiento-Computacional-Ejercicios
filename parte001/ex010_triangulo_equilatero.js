// Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
// perímetro, el valor de la altura y el área del triángulo.

const lado = 5;

const perimetro = 3 * lado;
const altura = Math.sqrt(3) * lado / 2;
const area = (lado * altura) / 2;

console.log("El perímetro del triángulo es: " + perimetro);
console.log("La altura del triángulo es: " + altura);
console.log("El área del triángulo es: " + area);
