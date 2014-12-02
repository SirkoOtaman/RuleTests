package com.testWeb.spring;

import javax.inject.Named;

/**
 * Created by shychka on 12/2/2014.
 */
@Named
public class ServiceNew implements IService{
    @Override
    public void doIt() {
        System.out.println("New service");
    }
}
