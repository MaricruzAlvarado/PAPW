function calcularAngulo(n) {
    n = n.value;
    console.log(n);
    var resultado = (180 * (n - 2))/(n);
    var e = document.getElementById("Resultado");
    e.innerHTML = resultado;
    return resultado;
}