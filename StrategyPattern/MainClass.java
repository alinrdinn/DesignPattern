package StrategyPattern;

import Fly.FlyNoWay;
import Fly.FlyWithWings;
import Fly.IFlyBehaviour;
import Quack.IQuackBehaviour;
import Quack.Quack;
import Quack.Squeek;
import Quack.MuteQuack;
import Swim.ISwimBehaviour;
import Swim.Stay;
import Swim.Swim;

public class MainClass {
    public static void main(String[] args) {

        // Red Head Duck
        IFlyBehaviour flyBehaviour = new FlyWithWings();
        IQuackBehaviour quackBehaviour = new Quack();
        ISwimBehaviour swimBehaviour = new Swim();

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("\nWhat is the behaviour of the red head duck?");
        redHeadDuck.setFlyBehaviour(flyBehaviour);
        redHeadDuck.setQuackBehaviour(quackBehaviour);
        redHeadDuck.setSwimBehaviour(swimBehaviour);

        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.performSwim();

        // Rubber Duck
        IFlyBehaviour noFlyBehaviour = new FlyNoWay();
        IQuackBehaviour squeekBehaviour = new Squeek();
        ISwimBehaviour stayBehaviour = new Stay();

        System.out.println("\nWhat is the behaviour of the rubber duck?");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehaviour(squeekBehaviour);
        rubberDuck.setFlyBehaviour(noFlyBehaviour);
        rubberDuck.setSwimBehaviour(stayBehaviour);

        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        // Wodden Duck
        IQuackBehaviour noQuackBehaviour = new MuteQuack();
        Duck woddenDuck = new WoddenDuck();
        
        System.out.println("\nWhat is the behaviour of the wodden duck?");
        woddenDuck.setFlyBehaviour(noFlyBehaviour);
        woddenDuck.setQuackBehaviour(noQuackBehaviour);
        woddenDuck.setSwimBehaviour(stayBehaviour);
        
        woddenDuck.performQuack();
        woddenDuck.performFly();
        woddenDuck.performSwim();
        
    }
}