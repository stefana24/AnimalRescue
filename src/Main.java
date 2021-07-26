import animals.Cat;
import animals.Dog;
import animals.Duck;

public class Main {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setColor("black");
        System.out.println(dog.getName()+" color:"+dog.getColor());
        dog.animalEating();
        dog.animalSleep();
        dog.makeSound();

        Cat cat = new Cat();
        cat.setKg(2.5);
        cat.setName("Kitty");
        System.out.println(cat.getName()+" kg: "+cat.getKg());
        cat.makeSound();
        cat.animalEating();
        cat.animalSleep();

        Duck duck = new Duck();
        duck.setName("Dukky");
        duck.setKg(5);
        System.out.println(duck.getName()+" kg:"+duck.getKg());
        duck.makeSound();
        duck.animalEating();
        duck.animalSleep();

    }
}
