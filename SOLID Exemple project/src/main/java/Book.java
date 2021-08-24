public class Book extends Item implements Taxable{

    private static final double BOOK_TAX = 0.15;

    private int numberOfPages;

    public Book(int numberOfPages, double price) {
        super(price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public double getTax() {
        return BOOK_TAX;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }











    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


}
