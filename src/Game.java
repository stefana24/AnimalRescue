public class Game {
    private Owner adaptor;
    private Dog dog;
    private Vet vet;

    public Game(){}

    public Game(Owner adaptor, Dog dobObj, Vet vet) {
        this.adaptor = adaptor;
        this.dog = dobObj;
        this.vet = vet;
    }

    public Owner getAdaptor() {
        return adaptor;
    }

    public void setAdaptor(Owner adaptor) {
        this.adaptor = adaptor;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
