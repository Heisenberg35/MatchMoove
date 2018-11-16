package com.societe.project.database;

import org.springframework.stereotype.Repository;

import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Profil;

@Repository
public interface ProfilRepository extends BaseCRUDRepository<Profil> {

}
