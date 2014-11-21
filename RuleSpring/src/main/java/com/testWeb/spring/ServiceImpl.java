package com.testWeb.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by shychka on 11/20/2014.
 */
@Service
public class ServiceImpl implements IService {


    @Override
    public void doIt() {
        System.out.println("Asasasas");
    }
}
