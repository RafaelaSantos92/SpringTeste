package com.bsm.BSM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjetivosDeAprendizagem")
public class ObjetivosDeAprendizagem {
	
	@GetMapping
	public String ObjetivosDeAprendizagem() {
		return "Lista de objetivos de aprendizagem da semana:"
				+ "\nAprender Spring"
				+ "\nDesenvolver o BD do projeto integrador"
				+ "\nAprender mais sobre o MySQL";
	}

}
;