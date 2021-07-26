package animals;

public class Dog extends Animal {
    private String dogBreeds;
    private int kg;

    public String getDogBreeds() {
        return dogBreeds;
    }

    public void setDogBreeds(String dogBreeds) {
        this.dogBreeds = dogBreeds;
    }

    public void addKgs(){
        kg++;
    }

    public void sleep(){
        System.out.println("Dog is sleeping....");
    }
    public void wake(){
        System.out.println("The dog is waking up");
    }

}
