/**
 * 
 */
package com.societe.project.database;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.societe.project.models.Article;
import com.societe.project.models.Compte;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArticleServiceTest {

	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private ArticleRepository articleRepository;
	
	@Test
    public void createAndFind() {
		Date date = new Date();
		Compte compte = new Compte("test@test.com", "test", 1);
		Article article = new Article("titre", "description", date, compte);
//		TODO à continuer
//		compteRepository.save(compte);
//		articleRepository.save(article);
//		
//		List<Article> articles = new ArrayList<Article>();
//		articles = articleRepository.findByTitle("titre");
//		
//		for (Article elt : articles) {
//			assertThat(elt.getTitle()).isEqualTo(article.getTitle());
//		}
		
		
	}
}
