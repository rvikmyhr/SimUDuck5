package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        FlyAndQuackGroup mallard = new MallardDuck(new FlyWithWings(), new Quack());
//        mallard.display();
        mallard.performQuack();
        mallard.performFly();
//        mallard.setFlyBehavior(new FlyRocketPowered());
//        mallard.setQuackBehavior(new Squeak());

//        Duck model = new ModelDuck();
//        model.display();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();

        MallardDuck duck = new MallardDuck(new FlyWithWings(), new Quack());

        duck.performFly();
        duck.performQuack();
        
        QuackOnlyGroup rubberduck = new RubberDuck(new Squeak());
        rubberduck.performQuack();
    }

}
