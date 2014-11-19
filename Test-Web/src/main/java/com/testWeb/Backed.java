package com.testWeb;

import com.testWeb.spring.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 * Created by shychka on 11/19/2014.
 */
@ManagedBean
@RequestScoped
public class Backed {
    private String text = "nope";

    @Inject
    private SpringBean spBean;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Backed() {
    }

    public String say() {
        System.out.println("Helllllooooo");

        return text = spBean.getMessage();
    }
}
