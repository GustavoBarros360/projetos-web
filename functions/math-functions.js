export function divisao(a, b) {
    return a/b;
}

export function soma(a, b) {
    return a+b;
}

export function mmc() {
    const peso = 60;
    const altura = 1.65;
    const imc = peso/altura**2;
    if (imc < 17){
        console.log('muito abaixo do peso');
    } else if (imc < 18.49) {
        console.log('abaixo do peso');
    } else if (imc < 24.99){
        console.log('abaixo do peso');
    } else if (imc < 30){
        console.log('sobrepeso');
    }
}