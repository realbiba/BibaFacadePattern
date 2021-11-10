package com.company;

public class Ball {
    private Sportsmen Footballer;
    private Sportsmen Basketballer;

    public Ball(){
        Footballer =new Footballer();
        Basketballer =new Basketballer();
    }

    public void takeFootballer(){
        Footballer.take();
    }
    public void takeBasketballer(){
        Basketballer.take();
    }
}
