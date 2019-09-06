package com.co;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class TestFactoryPattern implements Serializable {
    @EJB
    ShapeService shapeService;
    private String res = "";

    public void cerateCircle() {
        res = shapeService.createAllShape();
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
}
