public class MallardDuck extends Duck{

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("This is a mallard Duck");
    }
}
