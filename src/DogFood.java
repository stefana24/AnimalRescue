import java.time.LocalDate;

public class DogFood extends AnimalFood{
    private String qty;
    private Dog dog = new Dog();

    public DogFood(String name, double price, int quantity, LocalDate expirationDate, boolean isAvailable) {
        super(name, price, quantity, expirationDate, isAvailable);
    }
    public DogFood(){}

    public DogFood(String quantity){
        this.qty = quantity;
    }

    public Dog foodInfluenceOverDog(){
        if(qty.equals("too much")){
            setPrice(200);
            dog.setHunger(1);
            dog.setHealth(7);
            dog.setMood(9);
        }else if(qty.equals("too less")){
            dog.setHunger(10);
            dog.setHealth(7);
            dog.setMood(8);
            setPrice(50);
        }else{
            dog.setHunger(5);
            dog.setHealth(10);
            dog.setMood(10);
            setPrice(100);
        }
        return dog;
    }
}
