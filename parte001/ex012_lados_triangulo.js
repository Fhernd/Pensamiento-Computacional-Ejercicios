// Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
// semiperímetro y el área del triángulo.

const lado1 = 5;
const lado2 = 6;
const lado3 = 7;

const perimetro = lado1 + lado2 + lado3;
const semiperimetro = perimetro / 2;
const area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

console.log("El perímetro del triángulo es: " + perimetro);
console.log("El semiperímetro del triángulo es: " + semiperimetro);
console.log("El área del triángulo es: " + area);
