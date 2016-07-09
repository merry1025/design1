
package com.adam.design_1.kid;

import com.adam.design_1.eatBehavior.*;
import com.adam.design_1.playBehavior.*;

public class kid_2ndClass extends kid {
    
     public kid_2ndClass(){
    myEatBehavior = new eatFruit();
    myPlayBehavoir = new playBlock();
    }

    @Override
    public void display() {
        System.out.println("I am from 2nd class");
    }
}
