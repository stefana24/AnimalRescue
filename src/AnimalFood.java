import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private double price;
    private int quantity;
    private LocalDate expirationDate;
    private boolean isAvailable;

    public AnimalFood(String name, double price, int quantity, LocalDate expirationDate, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate  getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate  expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
