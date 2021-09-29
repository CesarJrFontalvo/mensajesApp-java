package com.platzi.mensajesApp;

import java.util.Scanner;

public class MensajesServices {
	
	public static void crearMensaje(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu mensaje");
		String mensaje =sc.nextLine();
		
		System.out.println("Escribe tu nombre");
		String nombre =sc.nextLine();
		
		Mensajes registro = new Mensajes();
		registro.setMensaje(mensaje);
		registro.setAutor_mensaje(nombre);
		MensajesDao.crearMensaje(registro);
		
	}
	
	public static void listarMensaje(){
		MensajesDao.leerMensajeDB();
	}
	
	public static void borrarMensaje(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el ID del mensaje a borrar");
		int id_mensaje =sc.nextInt();
		MensajesDao.borrarMensajeDB(id_mensaje);
		
	}
	
	public static void editarMensaje(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nuevo mensaje");
		String mensaje =sc.nextLine();
		
		System.out.println("Indica el ID del mensaje ");
		int id_mensaje =sc.nextInt();
		Mensajes actualizacion = new Mensajes();
		actualizacion.setId_mensaje(id_mensaje);
		actualizacion.setMensaje(mensaje);
		MensajesDao.actualizarMensajeDB(actualizacion);
		
	}

}
