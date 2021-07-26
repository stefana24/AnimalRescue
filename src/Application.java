import java.time.LocalDate;

public class Application {
    public static void main(String[]args) {
        RecreationActivity favActivity = new RecreationActivity("Barking");
        favActivity.setName("Barking");

        Dog tobby = new Dog("Tobby",2,3,4,7,"pizza",favActivity);
        System.out.println("Health: "+tobby.getHealth());
        System.out.println("Hunger: "+tobby.getHunger());
        System.out.println("Mood: "+tobby.getMood());
        DogFood dogFood = new DogFood("too less");
        tobby = tobby.food(dogFood);
        System.out.println("****************************");
        System.out.println("Health: "+tobby.getHealth());
        System.out.println("Hunger: "+tobby.getHunger());
        System.out.println("Mood: "+tobby.getMood());
        System.out.println("Price: "+dogFood.getPrice());

    }
}
