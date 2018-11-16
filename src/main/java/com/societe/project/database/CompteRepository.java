package com.societe.project.database;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Compte;

@Repository
public interface CompteRepository extends BaseCRUDRepository<Compte> {

	List<Compte> findByEmail(String email);

}
