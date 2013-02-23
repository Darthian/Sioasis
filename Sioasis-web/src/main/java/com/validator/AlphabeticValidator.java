/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author migueldiaz
 */
@FacesValidator(value = "alphabeticValidator")
public class AlphabeticValidator implements Validator {

    public AlphabeticValidator() {
    }
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String str = (String) value;
        Boolean flag = true;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Datos Inválidos",
                    "Éste campo sólo admite valores alfabéticos");
            throw new ValidatorException(message);
        }
    }
}
