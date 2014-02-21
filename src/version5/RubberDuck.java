package version5;

public class RubberDuck implements Duck, QuackOnlyGroup {

    private QuackBehavior quackBehavior;

    public RubberDuck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void swim() {

    }
}
