package com.example.electronics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AcController {
	@Autowired
	AcService as;
	
	@PostMapping(value="/postThis")
	public String posting(@RequestBody AcEntity a) throws PriceException {
		return as.posting(a);
	}
	
	@GetMapping(value="/getById/{id}")
	public AcEntity getId(@PathVariable int id) {
		return as.getId(id);
	}
	
	@GetMapping(value="/getByBrand/{b}")
	public AcEntity getByBrand(@PathVariable String b) {
		return as.getByBrand(b);
	}

}
