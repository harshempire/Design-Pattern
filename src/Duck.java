public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    abstract void display();

    public void performfly(){
        flyBehaviour.fly();
    }
    public void performquck(){
        quackBehaviour.quack();
    }

}
