package com.testWeb.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by shychka on 11/19/2014.
 */
@Named("sprBean")
public class SpringBean {
    public SpringBean() {
    }

    String message = "lol";

    @Inject
    private IService service;

    public String getMessage(){
        service.doIt();
        System.out.println("SPRING!!!");
        return "Spring RULES";
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
