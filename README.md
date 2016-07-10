# java设计模式之一策略模式(Strategy)

####对象抽象类(abstract class)
  
  public abstract class kid {
  ```java
    //抽象类建立eatBehavior 和 playBehavior的实例
    eatBehavior myEatBehavior;
    playBehavior myPlayBehavoir;

    public kid() {
    }
    
    //抽象类中定义共有的抽象方法
    public void play() {
        myPlayBehavoir.play();
    }

    public void eat() {
        myEatBehavior.eat();
    }
    
    //定义一个抽象方法，子方法一定要实现它
    public abstract void display();
    
    public void SetEatBehavoir(eatBehavior eb) {
        myEatBehavior = eb;
    }
    public void SetFlyBehavoir(playBehavior pb) {
        myPlayBehavoir = pb;
    }
  }
    ```
####对象的通用行为用接口(interface)定义
  
  1. 吃这个动作的接口 eatBehavior.java
  ```java
  public interface eatBehavior {
    void eat();
  }
  ```
  
  两个子类实现此接口，定义不同的eatBehavior动作
    第一个子类:eatCookie.java 吃饼干    
    ```java
    public class eatCookie implements eatBehavior {
      @Override
      public void eat() {
        System.out.println("I am eating a cookie");
      }
    }
    ```
    第二个子类:eatFruit.java 吃水果
    ```java
    public class eatFruit implements eatBehavior{
      @Override
      public void play(){
        System.out.println("I am eating a fruit~");
      }
    }
    ```
  2. 玩这个动作的接口 playBehavior.java
  ```java
  package com.adam.design_1.playBehavior;
    public interface playBehavior {
    void play();
  }
  ```
  两个子类实现此接口，定义不同的playBehavior动作
    第一个子类:playBalloon.java 玩气球
  ```java
    public class playBalloon implements playBehavior {
      @Override
      public void play() {
        System.out.println("I am playing balloon~");
      }
    }
    ```
    
    第二个子类:playBlock.java 玩积木
    ```java
    public class playBlock implements playBehavior{
      @Override
      public void eat(){
        System.out.println("I am playing block~");
      }
    }
    ```
  
  





