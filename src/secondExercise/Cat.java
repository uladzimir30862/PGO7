package secondExercise;

public class Cat extends Animal implements Moveable{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Kot";
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
}
