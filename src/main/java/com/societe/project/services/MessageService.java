package com.societe.project.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.societe.project.database.MessageRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Message;
import com.societe.project.models.Profil;
import com.societe.project.models.Trajet;
import com.societe.project.services.base.BaseService;

@Service
public class MessageService extends BaseService<Message>{
	
	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	protected BaseCRUDRepository<Message> getCRUDRepository() {
		
		return messageRepository;
	}

	@Override
	protected List<Message> setItemsByCriterias(Message item, List<Message> result) {
		
		if (!item.getContent().trim().equals("")) {
			result = this.messageRepository.findByContent(item.getContent());
		}else if(!item.getDate().equals(null)) {
			result = this.messageRepository.findByDate(item.getDate());
		}
	
		return result;
	}
	
	public List<Message> findByProfilMessage(Profil profil) {
		return messageRepository.findByProfil(profil);
	}
	
	public List<Message> findByTravel(Trajet trajet){
		return messageRepository.findByTrajet(trajet);
	}
	
	

}
