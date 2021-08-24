public class Skateboard extends Item implements Taxable{

    private static final double SKATEBOARD_TAX = 0.10;

    public Skateboard(double price) {
        super(price);
    }

    @Override
    public double getTax() {
        return SKATEBOARD_TAX;
    }
}
