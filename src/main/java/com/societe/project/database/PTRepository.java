package com.societe.project.database;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.PT;
@Repository
public interface PTRepository extends BaseCRUDRepository<PT>{
	//List<PT> findByNbrePlaceAndVolumeMax(Integer nbrePlace, Double volumeMax);
	List<PT> findByNbrePlace(Integer nbrePlace);
	List<PT> findByVolumeMax(Double volumeMax);
}
