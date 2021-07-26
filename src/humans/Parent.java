package humans;

public class Parent {
    private String height;
    private int age;
    private String hairColor;
    private boolean loveAnimals;

    public Parent(String height){
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public Parent(String height, int age, String hairColor, boolean loveAnimals) {
        this.age = age;
        this.hairColor = hairColor;
        this.height = height;
        this.loveAnimals = loveAnimals;
    }

    @Override
    public String toString() {
        return "height='" + height + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                ", loveAnimals=" + loveAnimals;
    }
}
