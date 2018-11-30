package com.societe.project.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.societe.project.models.Compte;
import com.societe.project.services.CompteService;

@Component
public class CompteValidator implements Validator {

	@Autowired
	private CompteService compteService;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Compte.class.equals(clazz);
	}
	
	@Override
	public void validate(Object objet, Errors errors) {
		Compte compte = (Compte) objet;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "notEmpty");
			if (compteService.findByEmail(compte.getEmail()) != null) {
			errors.rejectValue("email", "Duplicate.userForm.email");
		}
		
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	       	if (compte.getPassword().length() < 8 || compte.getPassword().length() > 32) {
	            errors.rejectValue("password", "Size.userForm.password");
	        }
	}

}
