package com.uca.capas.tarea.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		String texto = "Informacion del alumno, Erick Fernando Leones Arevalo ,"
				+ "00092217, ingenieria en informatica, cuarto año";
		return texto;
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param1 = Integer .parseInt(request.getParameter("dia")); 
		Integer param2 = Integer .parseInt(request.getParameter("mes")); 
		Integer param3 = Integer .parseInt(request.getParameter("año")); 
		
		String diaSemana="";
		
		Calendar calen = Calendar.getInstance();
		calen.set(param3,param2-1,param1);
		
		int numeroSemana;
		numeroSemana=calen.get(Calendar.DAY_OF_WEEK);
		
		switch(numeroSemana) {
			case Calendar.SUNDAY: diaSemana = "Domingo";
			break;
			case Calendar.MONDAY: diaSemana = "Lunes";
			break;
			case Calendar.TUESDAY: diaSemana = "Martes";
			break;
			case Calendar.WEDNESDAY: diaSemana = "Miercoles";
			break;
			case Calendar.THURSDAY: diaSemana = "Jueves";
			break;
			case Calendar.FRIDAY: diaSemana = "Viernes";
			break;
			case Calendar.SATURDAY: diaSemana = "Sabado";
			break;
			default: diaSemana = "Ningun dia seleccionado";
			break;
	}
		
		return "Dia de la semana es " + diaSemana;
	}
}
