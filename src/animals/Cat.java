package animals;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Meow meow");
    }

    @Override
    public void cute() {
        System.out.println("I am a cute cat");
    }

}
