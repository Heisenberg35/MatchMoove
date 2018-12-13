package com.societe.project.database;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Message;
import com.societe.project.models.Profil;
import com.societe.project.models.Trajet;

@Repository
public interface MessageRepository extends BaseCRUDRepository<Message> {
	 List<Message>   findByContent(String content);
	 List<Message>   findByDate(Date date);
	 List<Message>   findByProfil(Profil profil);
	 List<Message>   findByTrajet(Trajet trajet);
}
