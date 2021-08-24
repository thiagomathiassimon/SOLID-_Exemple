public class Guitar extends Item implements Taxable{

    private static final double GUITAR_TAX = 0.20;

    public Guitar(double price) {
        super(price);
    }

    @Override
    public double getTax() {
        return GUITAR_TAX;
    }
}
