/*
 * Developer: René Mariano Sanabria, renemarianos@hotmail.com, https://github.com/renesanabria90
 * 
 * Get Date and Time. 
 *
 * 
 * */
package com.mabe.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class FechaHora {
	
	public static String getFechaHora(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String fecha_hora = dateFormat.format(cal.getTime()).trim();
		//System.out.println(fecha_hora);
		return fecha_hora.trim();
	}
	public static long calcularTime(String tiempoLogin){
		
		//Date and time of user login
		List<String> fechaHora = Arrays.asList(tiempoLogin.split("\\_"));
		List<String> fecha = Arrays.asList(fechaHora.get(0).split("\\/"));
		List<String> hora = Arrays.asList(fechaHora.get(1).split("\\:"));
		
		//Date and time of an transaction
		List<String> fechaHora1 = Arrays.asList(FechaHora.getFechaHora().split("\\_"));
		List<String> fecha1 = Arrays.asList(fechaHora1.get(0).split("\\/"));
		List<String> hora1 = Arrays.asList(fechaHora1.get(1).split("\\:"));
		
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(Integer.parseInt(fecha1.get(0)),Integer.parseInt(fecha1.get(1)),Integer.parseInt(fecha1.get(2)),
				Integer.parseInt(hora1.get(0)), Integer.parseInt(hora1.get(1)), Integer.parseInt(hora1.get(2)));
		
		cal.set(Integer.parseInt(fecha.get(0)), Integer.parseInt(fecha.get(1)), Integer.parseInt(fecha.get(2)),
				Integer.parseInt(hora.get(0)), Integer.parseInt(hora.get(1)), Integer.parseInt(hora.get(2)));
		
		long dif = cal1.getTimeInMillis() - cal.getTimeInMillis();
		long dif1 = cal.getTimeInMillis() - cal1.getTimeInMillis();
		long diffSeconds = dif / 1000;
		long diffMinutes = dif / (60 * 1000);
		long diffHours = dif / (60 * 60 * 1000);
        long diffDays = dif / (24 * 60 * 60 * 1000);
        System.out.println("Diferencia cal1 - cal: "+dif);
        System.out.println("Diferencia cal - cal1: "+dif1);
		System.out.println("Diferencia en segundos "+diffSeconds);
		System.out.println("Diferencia en minutos "+diffMinutes);
		System.out.println("Diferencia en Horas "+diffHours);
		System.out.println("Diferencia en Dias "+diffDays);
		System.out.println("Hora y fecha en del Login: "+tiempoLogin);
		System.out.println("Fecha: "+fechaHora.get(0));
		System.out.println("Hora: "+fechaHora.get(1));
		System.out.println("Tiempo en milis: "+ cal.getTimeInMillis());
		System.out.println("Tiempo Inicial en milis: "+ cal1.getTimeInMillis());
		return diffSeconds;
      }
}
