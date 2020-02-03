package com.LocalDateJava.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LocalDateJava.demo.model.LocalDateModel;
import com.LocalDateJava.demo.service.ServiceLocalData;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/v1/crud")
public class controllerLocalData {

	@Autowired
	ServiceLocalData serviceLocalData;

	@ApiOperation(value = "Busca tudos os clientes", response = LocalDateModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "HttpStatus 200 = Executado com sucesso."),
			@ApiResponse(code = 404, message = "HttpStatus 404 = Falhas ao buscar."),
			@ApiResponse(code = 500, message = "Código da falha: 500 = Erro interno sem causa mapeada.") })
	@GetMapping(path = "/selectParam", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> testeLocalDate(@RequestBody LocalDateModel localdata) {

		LocalDateModel responseLocalDateModel = serviceLocalData.ServiceData(localdata);

		return new ResponseEntity<LocalDateModel>(responseLocalDateModel, HttpStatus.OK);
	}

}
