package com.co;

import javax.ejb.*;
import javax.inject.Inject;

@Stateless
@LocalBean
//@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ShapeService {
    @Inject
    private Circle  circle;
    @Inject
    private Triangle triangle;
    @Inject
    private Rectangle rectangle;

    public String createAllShape(){
        return circle.draw()+" "+ triangle.draw()+" "+   rectangle.draw();
    }
}
