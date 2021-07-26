import java.time.LocalDate;

public class Application {
    public static void main(String[]args) {
        RecreationActivity favActivity = new RecreationActivity();
        favActivity.setName("Barking");

        Dog tobby = new Dog("Tobby",2,3,4,7,"pizza",favActivity);
        Owner mara = new Owner("Mara",200);
        AnimalFood dogFood = new AnimalFood("Skipper",150,3, LocalDate.of(2022,7,28),true);

        Vet julia = new Vet("Julia","ANIMAL WELFARE");
        Game game = new Game(mara,tobby,julia);

    }
}
