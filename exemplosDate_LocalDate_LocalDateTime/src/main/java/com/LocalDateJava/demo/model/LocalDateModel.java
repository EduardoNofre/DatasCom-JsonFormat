package com.LocalDateJava.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocalDateModel {

	private String texto;

	private LocalDate _LocalDateDefault;

	private LocalDateTime _LocalDateTimeDefault;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate _LocalDatePattern;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime _LocalDateTime;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Brazil/East")
	private LocalDateTime _LocalDateTimeTimezone;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date _DatePatternDateTime;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date _DatePatternDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private Date _DateLocaleTimezone;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private Date _DateLocaleTimezoneMMyyyy;

}
