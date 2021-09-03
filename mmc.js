const peso = 60;
const altura = 1.65;
const imc = peso/altura**2;
if (imc > 25){
    console.log('gordo');
} else {
    console.log('magro');
}