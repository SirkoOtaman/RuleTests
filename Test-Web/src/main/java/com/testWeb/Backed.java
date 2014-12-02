package com.testWeb;

import com.testWeb.spring.IService;
import com.testWeb.spring.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by shychka on 11/19/2014.
 */
@Named
@ViewScoped
public class Backed {
    private String text = "nope";

    @Inject
    @Qualifier("serviceNew")
    private IService spBean;

    @Inject
    @Qualifier("serviceImpl")
    private IService service;

    public IService getSpBean() {
        return spBean;
    }

    public void setSpBean(IService spBean) {
        this.spBean = spBean;
    }

    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }

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
        spBean.doIt();
        service.doIt();
        return "end";

    }
}
