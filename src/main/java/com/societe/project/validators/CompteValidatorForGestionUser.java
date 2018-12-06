package com.societe.project.validators;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.societe.project.models.Adresse;
import com.societe.project.models.Compte;

@Component
public class CompteValidatorForGestionUser implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Adresse.class.equals(clazz);
	}
	
    public void validate(Object o, Errors errors) {
        Compte compte = (Compte) o;
        
        List<Adresse> adresses = compte.getProfil().getAdresses();
        
        for (Adresse adresse : adresses) {
        	if (adresse.getNumero() == null) {
                errors.rejectValue("profil.adresses[0].numero", "Le numéro de l'adresse ne doit pas être null");
            }
        	if (adresse.getRue() == null || adresse.getRue().length() > 38) {
        		errors.rejectValue("profil.adresses[0].rue", "La rue de l'adresse ne doit pas être null et/ou ne doit pas dépasser 38 caractères");
        	}
        	if (adresse.getCp() == null || adresse.getCp() <= 4 || adresse.getCp() >= 6) {
        		errors.rejectValue("profil.adresses[0].cp", "Le code postal de l'adresse ne doit pas être null et/ou ne doit pas avoir moins de 5 chiffres et/ou ne doit pas avoir plus de 5 chiffres");
			}
        	
//        	adresseValidator.validate(adresse, bindingResult);
//			
//			if (bindingResult.hasErrors()) {
//	        	return "redirect:" + URL_GESTION_COMPTE;
	        }
			
//			adresseService.save(adresse);	
		}
        
    }


