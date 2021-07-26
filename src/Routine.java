import animals.Dog;
import humans.Child;

public class Routine {
    private Child fetita;
    private Dog dog;

    public Routine(Child fetita, Dog dog) {
        this.fetita = fetita;
        this.dog = dog;
    }

    public Child getFetita() {
        return fetita;
    }

    public void setFetita(Child fetita) {
        this.fetita = fetita;
    }

    public Dog getDog() {
        dog.removeKgs();
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
