import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item book = new Book(425, 50.00);
        Item skateboard = new Skateboard(100.00);
        Item guitar = new Guitar(250.00);
        Item bike = new Bike(800.50);

        System.out.println(new FiscalNote(List.of(book, skateboard, guitar, bike)).getTotal());

        System.out.println(new FiscalNote(List.of(book, skateboard, guitar, bike)).getTaxes());

    }

}









