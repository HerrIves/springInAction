package com.example.demo;

import ch.qos.logback.core.BasicStatusManager;
import ch.qos.logback.core.util.COWArrayList;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Long id;
    private Date placedAt;
    @NotBlank(message = "name is requaired")
    private String name;
    @NotBlank(message = "street is requaired")
    private String street;
    @NotBlank(message = "city is requaired")
    private String city;
    @NotBlank(message = "state is required")
    private String state;
    @NotBlank(message = "zip code is required")
    private String zip;

    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message="Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

//    @ManyToMany(targenEntity=Taco.class)
    private List<Taco> tacos = new ArrayList<>();

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }
}