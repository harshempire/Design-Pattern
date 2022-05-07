public class ModelDuck extends Duck{
    public ModelDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuck());
    }

    @Override
    void display() {
        System.out.println("I am a Model Duck");
    }
}
