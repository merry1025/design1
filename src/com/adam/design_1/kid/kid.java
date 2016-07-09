package com.adam.design_1.kid;

import com.adam.design_1.eatBehavior.eatBehavior;
import com.adam.design_1.playBehavior.playBehavior;

/**
 * Abstract class of kid
 *
 * @author Adam
 */
public abstract class kid {

    eatBehavior myEatBehavior;
    playBehavior myPlayBehavoir;

    public kid() {
    }

    public void play() {
        myPlayBehavoir.play();
    }

    public void eat() {
        myEatBehavior.eat();
    }

    public abstract void display();

    public void SetEatBehavoir(eatBehavior eb) {
        myEatBehavior = eb;
    }

    public void SetFlyBehavoir(playBehavior pb) {
        myPlayBehavoir = pb;
    }

}
