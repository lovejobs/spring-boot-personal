package com.lovejobs.vo;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class ValidateObject {

    @NotBlank(message = "name is now allow blank")
    private String name;

    @NotNull(message = "age is now allow null")
    private Long age;

    //@NotNull(message = "amout must be bg 0")
    private Double amount;
}
