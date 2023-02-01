package com.example.electronics;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AcDao {
	@Autowired
	AcRepository ar;

	public String posting(AcEntity a) {
		 ar.save(a);
		 return "Successfully posted";
	}

	public AcEntity getId(int id) {
		//return ar.findById(id).get();
		return ar.findById(id).orElseThrow(()->new NoSuchElementException());
	}

	public AcEntity getByBrand(String b) {
		return ar.getByBrand(b);
	}

}
