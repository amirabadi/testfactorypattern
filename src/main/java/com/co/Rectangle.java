package com.co;

import javax.enterprise.inject.Alternative;

@Alternative
public class Rectangle implements Shape {

    public String draw() {
        return "Rec created!!!!!;)";
    }
}
