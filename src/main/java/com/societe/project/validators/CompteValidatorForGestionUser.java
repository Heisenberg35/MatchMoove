package com.societe.project.validators;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.societe.project.models.Adresse;
import com.societe.project.models.Car;
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
        List<Car> cars = compte.getProfil().getCars();
        
        for (Adresse adresse : adresses) {
        	if (adresse.getNumero() == null) {
                errors.rejectValue("profil.adresses[0].numero", "Le numéro de l'adresse ne doit pas être null");
            }
        	if (adresse.getRue() == null || adresse.getRue().length() > 38) {
        		errors.rejectValue("profil.adresses[0].rue", "La rue de l'adresse ne doit pas être null et/ou ne doit pas dépasser 38 caractères");
        	}
        	if (adresse.getCp() == null || adresse.getCp().toString().length() != 5 ) {
        		errors.rejectValue("profil.adresses[0].cp", "Le code postal de l'adresse ne doit pas être null et/ou ne doit pas avoir moins de 5 chiffres et/ou ne doit pas avoir plus de 5 chiffres");
			}
        	if (adresse.getVille() == null || adresse.getVille().length() < 2 || adresse.getVille().length() > 38 ) {
                errors.rejectValue("profil.adresses[0].ville", "La ville de l'adresse ne doit pas être null et/ou ne doit pas être inférieur à 2 lettres et/ou ne doit pas être supérieur à 38 lettres");
            }
		}
        
//        if (!cars.isEmpty()) {
//	        for (Car car : cars) {
//	        	if (car.getMarque().length() < 2 || car.getMarque().length() > 38)  {
//	                errors.rejectValue("profil.cars[0].marque", "La marque de la voiture ne doit pas être inférieur à 2 lettres et/ou ne doit pas être supérieur à 38 lettres");
//	            }
//			}
//        }
    }
}
    


