package com.co;

import javax.enterprise.inject.Alternative;

@Alternative
public class Triangle implements Shape{

    public String draw() {
return "Triangle created!!!!!!!";
    }
}
