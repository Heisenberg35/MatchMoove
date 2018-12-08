/**
 * 
 */
package com.societe.project.database;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource(value= {"test.application.properties"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArticleServiceTest {

	@Test
    public void createAndFind() {
		
	}
}
