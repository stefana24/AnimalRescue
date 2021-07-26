package animals;

public abstract class Animal {
    private String name;
    private int age;
    private double kg;
    private String color;

    public void animalEating(){
        System.out.println("Eating...");
    }
    public void animalSleep(){
        System.out.println("Animal is sleeping...");
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

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
