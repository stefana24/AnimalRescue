package animals;

public class Dog extends Animal {
    private String dogBreeds;

    public Dog(){
        kg = 25;
        setAge(1);
        setHealth(5);
        setHunger(5);
    }

    public String getDogBreeds() {
        return dogBreeds;
    }

    public void setDogBreeds(String dogBreeds) {
        this.dogBreeds = dogBreeds;
    }

    //each time the dog is feed, kgs are added
    public void addKgs(){
        kg+=0.1;
    }

    public void removeKgs(){
        kg-=0.1;
    }

    public void sleep(){
        System.out.println("Dog is sleeping....");
    }
    public void wake(){
        System.out.println("The dog is waking up");
    }



}
