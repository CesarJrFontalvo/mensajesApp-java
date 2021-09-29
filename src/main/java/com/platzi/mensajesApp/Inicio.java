package com.platzi.mensajesApp;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion =0;
		
		do {
				System.out.println("----------------------------------");
				System.out.println(" Aplicación de menssajes");
				System.out.println(" 1. Crear mensaje");
				System.out.println(" 2. listar mensajes");
				System.out.println(" 3. eliminar mensaje");
				System.out.println(" 4. editar mensaje");
				System.out.println(" 5. salir");
				
				// Leer la opción del usuario
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1:
					MensajesServices.crearMensaje();
					break;
				case 2:
					MensajesServices.listarMensaje();
					break;
				case 3:
					MensajesServices.borrarMensaje();
					break;
				case 4:
					MensajesServices.editarMensaje();
					break;
					

				default:
					break;
				}
				
		} while (opcion !=5);
		
		

	}

}
