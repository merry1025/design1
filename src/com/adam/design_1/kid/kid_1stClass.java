
package com.adam.design_1.kid;

import com.adam.design_1.eatBehavior.*;
import com.adam.design_1.playBehavior.*;

public class kid_1stClass extends kid{
    
    public kid_1stClass(){
    myEatBehavior = new eatCookie();
    myPlayBehavoir = new playBalloon();
    }

    @Override
    public void display() {
        System.out.println("I am from 1st class");
    }
    
    
}
