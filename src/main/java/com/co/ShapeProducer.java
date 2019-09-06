package com.co;

import javax.enterprise.inject.Produces;

public class ShapeProducer {
    @Produces
    public Circle circleFactory(){
        return new Circle();
    }
    @Produces
    public Triangle triangleFactory(){
        return new Triangle();
    }
    @Produces
    public Rectangle rectangleFactory(){
        return new Rectangle();
    }
}
