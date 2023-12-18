package br.com.flo.correios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.flo.correios.exception.NotReadyException;
import br.com.flo.correios.exception.NoContentException;
import br.com.flo.correios.model.Address;
import br.com.flo.correios.service.CorreiosService;

@RestController
public class CorreiosController {
	
	@Autowired
	private CorreiosService service;
	
	@GetMapping("/status")
	public String getStatus() {
		return "Service Status: " + this.service.getStatus();
	}
	
	@GetMapping("/zipcode/{zipcode}")
	public Address getAddressByZipcode(@PathVariable("zipcode") String zipcode) throws NoContentException, NotReadyException {
		
		return this.service.getAddressByZipcode(zipcode);
	
//		Address address = new Address();
//		address.setZipcode(zipcode);
//		return address;
	}
	
	

}
