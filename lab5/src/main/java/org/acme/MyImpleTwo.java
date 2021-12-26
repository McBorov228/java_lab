package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@MyAnnotation
public class MyImpleTwo implements MyInterface {

    @Override
    public void draw() {
        System.out.println("Работает дважды!");
    }
}
