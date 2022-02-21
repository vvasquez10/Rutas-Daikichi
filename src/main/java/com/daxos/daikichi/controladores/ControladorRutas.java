package com.daxos.daikichi.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/daikichi" )

public class ControladorRutas {
	

	@RequestMapping( value="", method=RequestMethod.GET)
	public String despliegaSaludo() {
		return "Welcome";
	}
	
	@RequestMapping( value="/travel/{destiny}", method=RequestMethod.GET)
	public String despliegaViaje(@PathVariable("destiny") String d) {
		return "Felicitaciones! ¡Pronto viajarás a " + d + "!";
	}
	
	@RequestMapping( value="/lotto/{num}", method=RequestMethod.GET)
	public String despliegaLoteria(@PathVariable("num") int n) {
		
		if(n%2==0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}else if(n%2!=0) {			
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		} else {
			return "Error";
		}
	}
}