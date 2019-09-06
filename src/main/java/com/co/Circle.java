package com.co;

import javax.enterprise.inject.Alternative;

@Alternative
public class Circle implements Shape {

    public String draw() {
        return "Circle created!!!!!";
    }
}
