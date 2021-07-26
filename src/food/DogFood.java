package food;


public class DogFood extends AnimalFood{
    private double calorii;
    private FoodType type;

    public double getCalorii() {
        return calorii;
    }

    public void setCalorii(double calorii) {
        this.calorii = calorii;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }
}
