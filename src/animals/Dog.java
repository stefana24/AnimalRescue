package animals;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Ham ham");
    }

    @Override
    public void cute() {
        System.out.println("I am a cute dog");
    }
}
