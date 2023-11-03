package org.generation.arraysNumerosPrimos;

import java.util.Scanner;

public class arraysNumerosPrimos {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];

	        //Espacio para ingresar los numero
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingresa el número " + (i+1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Se analizan los numero para pasar los números primos al principio
	        int[] numerosPrimos = new int[10];
	        int indicePrimos = 0;
	        int indiceNoPrimos = 0;

	        for (int i = 0; i < 10; i++) {
	            if (esPrimo(numeros[i])) {
	                numerosPrimos[indicePrimos] = numeros[i];
	                indicePrimos++;
	            }
	        }

	        for (int i = 0; i < 10; i++) {
	            if (!esPrimo(numeros[i])) {
	                numerosPrimos[indicePrimos + indiceNoPrimos] = numeros[i];
	                indiceNoPrimos++;
	            }
	        }

	        // Se imprimen los numeros in gresados
	        System.out.println("Los numeros que ingresaste son");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + " - " + numeros[i]);
	        }

	        // Se imprime el array con los números primos al principio
	        System.out.println("Ahora los numeros primos estan al inicio");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + " - " + numerosPrimos[i]);
	        }
	        scanner.close();
	    }

	    // Verificamos si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }

	        return true;
	}

}
