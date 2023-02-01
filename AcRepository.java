package com.example.electronics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AcRepository extends JpaRepository<AcEntity,Integer> {

	@Query(value="SELECT * from ac_det where brand like ?", nativeQuery = true)
	AcEntity getByBrand(String b);

}
