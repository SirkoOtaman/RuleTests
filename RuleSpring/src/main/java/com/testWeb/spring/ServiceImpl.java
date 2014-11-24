package com.testWeb.spring;

import javax.inject.Named;

/**
 * Created by shychka on 11/20/2014.
 */
@Named
public class ServiceImpl implements IService {


    @Override
    public void doIt() {
        System.out.println("Asasasas");
    }
}
