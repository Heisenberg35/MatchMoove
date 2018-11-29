package com.societe.project.database;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Message;


@Repository
public interface MessageRepository extends BaseCRUDRepository<Message> {
	 List<Message>   findByContent(String content );
	 List<Message>   findByDate(Date date );
}
