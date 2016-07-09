package com.adam.design_1.kidSimulator;

import com.adam.design_1.kid.kid;
import com.adam.design_1.kid.kid_1stClass;
import com.adam.design_1.kid.kid_2ndClass;

public class kidSimulator {
    public static void main(String[] args) {
        kid kid1 = new kid_1stClass();
        kid kid2 = new kid_2ndClass();
        
        kid1.display();
        kid1.eat();
        kid1.play();
        
        kid2.display();
        kid2.eat();
        kid2.play();
        
    }
}
