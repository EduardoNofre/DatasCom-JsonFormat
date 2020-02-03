package com.LocalDateJava.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.LocalDateJava.demo.model.LocalDateModel;
import com.fasterxml.jackson.annotation.JsonFormat;

@Service
public class ServiceLocalData {

	public LocalDateModel ServiceData(LocalDateModel localdata) {
		
		System.out.println("===================================== ONSERVAÇÃO ================================================");
		System.out.println("=================================================================================================");
		System.out.println("=================================================================================================");
		System.out.println(" Observação: Aqui veremos como o dados chega no json \nMas o response obedece @JsonFormat        ");
		System.out.println("=================================================================================================");
		System.out.println("=================================================================================================");
		System.out.println("=================================================================================================");
		

		System.out.println("Texto Simples  " + localdata.getTexto()+ "\n");
		
		System.out.println("LocalDate Default  " + localdata.get_LocalDateDefault()+ "\n");
		
		System.out.println("LocalDateTime Default  " + localdata.get_LocalDateTimeDefault()+ "\n");		
		
		System.out.println("pattern = \"dd/MM/yyyy\" " + localdata.get_LocalDatePattern()+ "\n");
		
		System.out.println("pattern = \"dd/MM/yyyy HH:mm:ss\"  " + localdata.get_DatePatternDateTime()+ "\n");
		
		System.out.println("pattern = \"dd/MM/yyyy\"" + localdata.get_DatePatternDate()+ "\n");
		
		System.out.println("@JsonFormat(pattern = \"dd/MM/yyyy HH:mm:ss\"  " + localdata.get_LocalDateTime()+ "\n");
		
		System.out.println("pattern = \"dd/MM/yyyy HH:mm:ss\", timezone = \"Brazil/East\"  " + localdata.get_LocalDateTimeTimezone()+ "\n");
		
		System.out.println("shape = JsonFormat.Shape.STRING, pattern = \"dd/MM/yyyy\", locale = \"pt-BR\", timezone = \"Brazil/East\"  " + localdata.get_DateLocaleTimezone()+ "\n");
		
		System.out.println("" + LocalDateTime.now());
		
		return localdata;
	}
}
