public class Dog extends Animal{
    public Dog(String name, int age, int health, int hunger, int mood, String favoriteFood, RecreationActivity favoriteActivity) {
        super(name, age, health, hunger, mood, favoriteFood, favoriteActivity);
    }

    public Dog(){}

    public Dog food(DogFood dogFood){
        return dogFood.foodInfluenceOverDog();
    }
}
