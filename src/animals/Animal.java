package animals;

import veterinary.Vet;

public class Animal {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private Mood mood;
//    private String favoriteFood;
    private String bodyConstitution;
    private boolean wantsToEat;
    private boolean adopted;
    private boolean isVaccinated;

    protected double kg;

    public double getKg() {
        return kg;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Vet vet, boolean vaccinated) {
        isVaccinated = vaccinated;
        if(vaccinated==false){
            mood = Mood.FRICOS;
        }else{
            mood = Mood.MAI_FRICOS;
        }

    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public boolean getWantsToEat() {
        return wantsToEat;
    }

    public void setWantsToEat(boolean wantsToEat) {
        this.wantsToEat = wantsToEat;
    }

    public String getBodyConstitution() {
        return bodyConstitution;
    }

    public void setBodyConstitution(String bodyConstitution) {
        this.bodyConstitution = bodyConstitution;
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

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

//    public String getFavoriteFood() {
//        return favoriteFood;
//    }
//
//    public void setFavoriteFood(String favoriteFood) {
//        this.favoriteFood = favoriteFood;
//    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", hunger=" + hunger +
                ", mood=" + mood +
                ", bodyConstitution='" + bodyConstitution + '\'' +
                ", wantsToEat=" + wantsToEat +
                ", adopted=" + adopted ;
    }
}
