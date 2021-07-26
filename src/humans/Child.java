package humans;

import animals.Dog;

public class Child extends Parent{
    public Child(String height, int age, String hairColor,boolean loveAnimals) {
       super(height, age,  hairColor, loveAnimals);
    }

    public void feedDog(Dog dog){
        System.out.println("Feeding the dog");
        dog.setHunger(1);
    }

    public void walkDog(){
        System.out.println("Walking the dog");
    }
    public void playWithDog(){
        System.out.println("Playing with dog in the yard");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }
    public void wakeUp(){
        System.out.println("The girl is waking up");
    }

    public void doHomeworks(){
        System.out.println("The girl is doing her homework");
    }

}
