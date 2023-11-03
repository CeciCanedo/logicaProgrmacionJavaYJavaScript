document.addEventListener('DOMContentLoaded', function() {
    let numeroSecreto = Math.floor(Math.random() * 100) + 1;
    let intentos = [];

    document.getElementById('btnJugar').addEventListener('click', function() {
        let inputNumero = document.getElementById('num');
        let intento = parseInt(inputNumero.value);

        if (isNaN(intento) || intento < 1 || intento > 100) {
            alert("Por favor, ingresa un número válido entre 1 y 100.");
            inputNumero.value = '';
            return;
        }

        intentos.push(intento);

        if (intento === numeroSecreto) {
            alert("¡Felicidades, adivinaste el número secreto!");
            let resultadoNumeroSecreto = document.getElementById('numeroSecreto');
            resultadoNumeroSecreto.textContent = "El número secreto era: " + numeroSecreto;

            let resultadoIntentos = document.getElementById('intento');
            resultadoIntentos.textContent = "Lista de números introducidos: " + intentos.join(", ");
            
            inputNumero.disabled = true;
            this.disabled = true;
        } else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        }
    });
});
