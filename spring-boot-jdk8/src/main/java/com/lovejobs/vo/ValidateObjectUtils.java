package com.lovejobs.vo;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidateObjectUtils {

    private final static ValidatorFactory vf = Validation.buildDefaultValidatorFactory();

    public static void checkNotEmptyParams(ValidateObject e) {
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<Object>> set = validator.validate(e);
        for (ConstraintViolation<Object> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
            constraintViolation.getMessage();
        }
    }

    public static void main(String[] args) {
        ValidateObject validateObject = new ValidateObject();
        checkNotEmptyParams(validateObject);
    }
}
