public class Animal {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private int mood;
    private String favoriteFood;
    private RecreationActivity favoriteActivity;

    public Animal(){}

    public Animal(String name, int age, int health, int hunger, int mood, String favoriteFood, RecreationActivity favoriteActivity) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.hunger = hunger;
        this.mood = mood;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public RecreationActivity getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(RecreationActivity favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", hunger=" + hunger +
                ", mood=" + mood +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity.getName() + '\'' +
                '}';
    }
}
