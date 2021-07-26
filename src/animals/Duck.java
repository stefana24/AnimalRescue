package animals;

public class Duck extends Animal{
    @Override
    public void speak() {
        System.out.println("Mac mac");
    }

    @Override
    public void cute() {
        System.out.println("I am not a cute duck");
    }

}
