import Exception.InvalidPriceException;

public abstract class Item {

    private double price;

    public Item(double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }









    public void setPrice(double price) {
        this.price = price;
    }

}
