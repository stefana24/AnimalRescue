import java.time.LocalDate;

public class Application {
    public static void main(String[]args) {
        RecreationActivity favActivity = new RecreationActivity();
        favActivity.setName("Barking");

        Dog tobby = new Dog();
        tobby.setName("Tobby");
        tobby.setAge(3);
        tobby.setFavoriteActivity(favActivity);
        tobby.setFavoriteFood("pizza");
        tobby.setHealth(5);
        tobby.setHunger(5);
        tobby.setMood(7);
        System.out.println(tobby);

        Owner mara = new Owner();
        mara.setName("Mara");
        mara.setAvailableMoney(200);
        System.out.println("Owner: "+mara.getName()+" with money: "+mara.getAvailableMoney());

        AnimalFood dogFood = new AnimalFood();
        dogFood.setName("Skipper");
        dogFood.setPrice(150);
        dogFood.setQuantity(3);
        dogFood.setExpirationDate(LocalDate.of(2022,7,28));
        dogFood.setAvailable(true);
        System.out.println(dogFood);

        Vet julia = new Vet();
        julia.setName("Julia");
        julia.setSpecialization("ANIMAL WELFARE");
        System.out.println("Vet: "+julia.getName()+" spcialization:"+julia.getSpecialization());

        Game game = new Game();
        game.setAdaptor(mara);
        game.setVet(julia);
        game.setDog(tobby);
        System.out.println();

    }
}
