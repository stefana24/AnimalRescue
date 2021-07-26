import animals.Dog;
import animals.Mood;
import food.DogFood;
import food.FoodType;
import humans.Child;
import humans.Parent;
import veterinary.Nurse;
import veterinary.Vet;

public class Application {
    public static void main(String[]args) {
        Child fetita = new Child("mica",7,"roscat",true);
        Parent tatal = new Parent("inalt");
        System.out.println("Fetita: "+fetita);
        System.out.println("Tatal: "+tatal.getHeight());

        Dog puffy = new Dog();
        puffy.setDogBreeds("corcitura de labrador");
        puffy.setMood(Mood.NEFERICIT);
        puffy.setBodyConstitution("slab");
        puffy.setWantsToEat(false);
        puffy.setAdopted(true);
        puffy.setName("Puffy");
        System.out.println("Dog: "+puffy);
        System.out.println(puffy.getKg());

        puffy.setMood(Mood.FRICOS);

        //normal 27-34 kg
        while(puffy.getKg()<35){
            fetita.feedDog(puffy);
        }
        System.out.println("Dog: "+puffy);
        System.out.println(puffy.getKg());

        DogFood dogFood = new DogFood();
        puffy.setAge(3);
        puffy.setBodyConstitution("potrivit");
        puffy.setMood(Mood.ENERGIC);
        puffy.setHealth(7);

        fetita.playWithDog();

        Vet vet = new Vet("Bobby","EMERGENCY AND CRITICAL CARE");
        puffy.setVaccinated(vet,true);
        Nurse alina = new Nurse("Alina","draguta");
        alina.pet(puffy);
        alina.calmAnimal(puffy);

        dogFood.setType(FoodType.HRANA_UMEDA);
        fetita.feedDog(puffy);

        dogFood.setType(FoodType.MANCARE_SPECIALA);


        System.out.println("Routine:");
        Routine routine = new Routine(fetita,puffy);
        int counter = 0;
        while(puffy.getKg()>27){
            System.out.println("Day:"+counter);
            routine.getFetita().wakeUp();
            routine.getFetita().feedDog(puffy);
            routine.getFetita().walkDog();
            System.out.println("They arrive home");
            routine.getDog().sleep();
            routine.getFetita().doHomeworks();
            routine.getDog().wake();
            routine.getFetita().playWithDog();
            routine.getFetita().walkDog();
            routine.getFetita().feedDog(puffy);
            routine.getDog().sleep();
            counter++;
        }

    }
}
