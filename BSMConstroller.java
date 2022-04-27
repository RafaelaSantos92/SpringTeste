package com.bsm.BSM.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/BSM")
public class BSMConstroller {

		@GetMapping
		public String BSM () {
			return "BSMs Generation:"
					+ "\nComunicação, "
					+ "\nTrabalho em equipe, "
					+ "\nPersistência, "
					+ "\nOrientação ao futuro, "
					+ "\nOrientação ao detalhe, "
					+ "\nMentalidade de crescimento, "
					+ "\nResponsabilidade pessoal e  "
					+ "\nProatividade."; 
			
		}
			
			
	


}
