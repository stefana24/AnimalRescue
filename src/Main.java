import animals.Cat;
import animals.Dog;
import animals.Duck;

public class Main {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setColor("black");
        System.out.println(dog.getName()+" color:"+dog.getColor());
        dog.speak();
        dog.cute();


        Cat cat = new Cat();
        cat.setKg(2.5);
        cat.setName("Kitty");
        System.out.println(cat.getName()+" kg: "+cat.getKg());
        cat.speak();
        cat.cute();

        Duck duck = new Duck();
        duck.setName("Dukky");
        duck.setKg(5);
        System.out.println(duck.getName()+" kg:"+duck.getKg());
        duck.speak();
        duck.cute();

    }
}
