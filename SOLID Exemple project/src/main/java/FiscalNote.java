import java.util.List;

public class FiscalNote {
    private List<Item> items;

    public FiscalNote(List<Item> items) {
        this.items = items;
    }
    public double getTotal(){
        double total = 0.0;
        for (Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }

    public double getTaxes(){
        double taxes = 0.0;
        for (Item item : this.items){
            if (item instanceof Taxable){
                Taxable taxableItem = (Taxable) item;
                taxes += item.getPrice() * taxableItem.getTax();
                item.setPrice(5);
            }
        }
        return taxes;
    }





    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}



