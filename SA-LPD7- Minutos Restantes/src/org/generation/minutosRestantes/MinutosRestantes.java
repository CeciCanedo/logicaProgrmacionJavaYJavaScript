package org.generation.minutosRestantes;

import java.util.Scanner;

public class MinutosRestantes {
	public static void main(String [] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		//El programa solo debe avanzar mientras que el usuario escoja un dia de lunea a viernes
		String dia;
        do {
            System.out.println("Escribe un dia de lunes a viernes");
            dia= scanner.nextLine().toLowerCase();

            if (!esDiaValido(dia)) {
                System.out.println("Ups! Parece que tu opcion no es valida, por favor ingresa un día de lunes a viernes.");
            }
        } while (!esDiaValido(dia));
        
        //Si se valida el dia puede continuar con el ingreso de la hora y minutos, en el que tambien debe frenar si la seleccion no es correcta
		
        int hora;
		do{
			System.out.println("Escribe una hora de 0 a 24");
			hora= scanner.nextInt();
			
			if(!esHoraValida(hora)) {
				System.out.println("Oh no!, parece que tu hora no es valida, ingresa una hora entre 0 y 24");
			}
		}while(!esHoraValida(hora));
		
		
		int minutos;
		do {
			System.out.println("Escribe los minutos de 0 a 59");
			minutos=scanner.nextInt();
			
			if(!esMinutoValido(minutos)) {
				System.out.println("Cielos! detecto que los minutos no son correctos, ingresa nuevamente los minutos entre 0 y 59");
			}
		}while(!esMinutoValido(minutos));
		
		
		//Se declara una variable para el numero de minutos que cada dia contine al inicio (0:00) 
		int minutosLunes=6660;
		int minutosMartes=5220;
		int minutosMiercoles= 3780;
		int minutosJueves=2340;
		int minutosViernes=900;
		
		//Con base en los minutos de cada dia restamos los minutos que ya han pasado en funcion de la hora introducida por el usuario
		if(dia.equals("lunes")) {
			System.out.println("Faltan "+ (minutosLunes-(hora*60)-minutos)+ " minutos para el fin de semana");
		}if (dia.equals("martes")) {
			System.out.println("Faltan "+ (minutosMartes-(hora*60)-minutos)+ " minutos para el fin de semana");
		}if (dia.equals("miercoles")) {
			System.out.println("Faltan "+ (minutosMiercoles-(hora*60)-minutos)+ " minutos para el fin de semana");
		}if (dia.equals("jueves")){
			System.out.println("Faltan "+ (minutosJueves-(hora*60)-minutos)+ " minutos para el fin de semana");
		}if (dia.equals("viernes")) {
			System.out.println("Faltan "+ (minutosViernes-(hora*60)-minutos)+ " minutos para el fin de semana");
			
			scanner.close();
		}
	}
		//Verificamos que el usuario ingrese un dia, una hora y unos minutos validos
		public static boolean esDiaValido(String dia) {
	        String[] diasValidos = {"lunes", "martes", "miércoles", "jueves", "viernes"};
	        for (String diaValido : diasValidos) {
	            if (diaValido.equals(dia)) {
	                return true;
	            }
	        }
	        return false;
	
		}

		public static boolean esHoraValida(int hora) {
			int[] horasValidas= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
			for (int horaValida: horasValidas) {
				if(horaValida==hora) {
					return true;
				}
			}
			return false;
		}
		
		public static boolean esMinutoValido(int minutos) {
			int [] minutosValidos= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};
			for (int minutoValido: minutosValidos) {
				if (minutoValido==minutos) {
					return true;
				}
			}
			return false;
		}
		
}