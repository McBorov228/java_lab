package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyImple implements MyInterface {

    @Override
    public void draw() {
        System.out.println("Работает!");
    }
}
