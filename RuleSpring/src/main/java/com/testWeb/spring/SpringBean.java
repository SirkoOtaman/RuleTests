package com.testWeb.spring;

import org.springframework.stereotype.Component;

/**
 * Created by shychka on 11/19/2014.
 */
@Component("sprBean")
public class SpringBean {
    public SpringBean() {
    }

    public String getMessage(){
        System.out.println("SPRING!!!");
        return "Spring RULES";
    }
}
