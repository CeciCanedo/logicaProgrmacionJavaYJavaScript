document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('btnGenerar').addEventListener('click', function() {
        let numero = parseInt(document.getElementById('num').value);
        let resultadoElement = document.getElementById('resultado');

        if (!isNaN(numero) && numero >= 0) {
            let serie = fibonacci(numero);
            resultadoElement.textContent = serie.join(", ");
        } else {
            resultadoElement.textContent = 'Por favor, ingresa un número válido.';
        }
    });

    function fibonacci(n) {
        let serie = [0, 1];
        for (let i = 2; i < n; i++) {
            serie[i] = serie[i-1] + serie[i-2];
        }
        return serie;
    }
});
