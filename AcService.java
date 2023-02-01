package com.example.electronics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcService {
	@Autowired
	AcDao ad;

	public String posting(AcEntity a) throws PriceException {
		AcEntity x=a;
		//try {
		if(x.getPrice()<25000) {
			throw new PriceException("Lessthan 25k");
		}
		else {
			return ad.posting(a);
		}
	    //}
		//catch(PriceException p) {
			//return "This is lessthan 25k";
		//}
		
		//return ad.posting(a);
	}

	public AcEntity getId(int id) {
		return ad.getId(id);
	}

	public AcEntity getByBrand(String b) {
		return ad.getByBrand(b);
	}

}
