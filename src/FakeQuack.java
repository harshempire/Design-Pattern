public class FakeQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Fake Quack Behaviour");
    }
}
