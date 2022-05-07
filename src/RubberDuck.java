public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeack());
    }

    @Override
    void display() {
        System.out.println(" I  am rubber duck");
    }
}
