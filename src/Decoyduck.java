public class Decoyduck extends Duck{

    public Decoyduck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuck());
    }

    @Override
    void display() {
        System.out.println("This is decoy duck");
    }
}
