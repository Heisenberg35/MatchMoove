/**
 * 
 */
package com.societe.project.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.societe.project.models.Trajet;

/**
 * @author Fabrice
 *
 */
@Component
public class TrajetValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object o, Errors errors) {
		
		Trajet trajet = (Trajet) o;
		
		
	}

}
