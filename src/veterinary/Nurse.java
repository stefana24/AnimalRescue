package veterinary;

import animals.Animal;

public class Nurse {
    private String name;
    private String personality;

    public Nurse(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public void pet(Animal animal){
        System.out.println("Nurse is petting animal: "+animal.getName());
    }

    public void calmAnimal(Animal animal){
        System.out.println("Nurse is calming down animal: "+animal.getName());
    }
}
