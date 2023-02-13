import utilities.Grocery;
import utilities.Bakery;
import utilities.Gardening;
import utilities.Clothing;
import utilities.Household;
import java.time.LocalDate;
import java.lang.String;
public class Main {

    public static final Grocery grocery = new Grocery();
    public static final Bakery bakery = new Bakery();
    public static final Household household = new Household();
    public static final Clothing clothing = new Clothing();
    public static final Gardening gardening =  new Gardening();

    public static void main(String[] args) {
        //Code to figure out what days are tuesdays. Can do in separate test java files to have new dates or create new constants for other dates.
        LocalDate date = LocalDate.of(2023, 2, 14);
        double day = date.getDayOfWeek().getValue();

        // Grocery Department. Has 10% Discount on Tuesdays.
        grocery.setProductName("Broccoli");
        grocery.setProductSku("1221");
        grocery.setPrice(3.99);
        System.out.println("\n\nProduct: " + grocery.getProductName() + "   Product SKU: " + grocery.getProductSku());
        if (day == 2) {
            System.out.println("There is a discount today!");
            System.out.printf("You saved: $%,.2f", grocery.calculateDiscount());
            System.out.printf("\nTotal price: $%,.2f", (grocery.getPrice() - grocery.calculateDiscount()));
        } else {
            System.out.println("There is no discount today. Original Price: " + grocery.getPrice());
        }

        // Bakery Department. Has 20% Discount on Tuesdays.
        bakery.setProductName("Chocolate Chip Cookies - 12pk");
        bakery.setProductSku("2378");
        bakery.setPrice(7.97);
        System.out.println("\n\nProduct: " + bakery.getProductName() + "   Product SKU: " + bakery.getProductSku());
        if (day == 2) {
            System.out.println("There is a discount today!");
            System.out.printf("You saved: $%,.2f", bakery.calculateDiscount());
            System.out.printf("\nTotal price: $%,.2f", (bakery.getPrice() - bakery.calculateDiscount()));
        } else {
            System.out.println("There is no discount today. Original Price: " + bakery.getPrice());
        }

        // Household Department. Has 15% Discount on Tuesdays.
        household.setProductName("4 Tier Black Shelving Unit");
        household.setProductSku("3775");
        household.setPrice(89.50);
        System.out.println("\n\nProduct: " + household.getProductName() + "   Product SKU: " + household.getProductSku());
        if (day == 2) {
            System.out.println("There is a discount today!");
            System.out.printf("You saved: $%,.2f", household.calculateDiscount());
            System.out.printf("\nTotal price: $%,.2f", (household.getPrice() - household.calculateDiscount()));
        } else {
            System.out.println("There is no discount today. Original Price: " + household.getPrice());
        }

        // Clothing Department. Has 30% Discount on Tuesdays.
        clothing.setProductName("The Last of Us Clicker Graphic Tee - Sz. 4");
        clothing.setProductSku("4003");
        clothing.setPrice(24.99);
        System.out.println("\n\nProduct: " + clothing.getProductName() + "   Product SKU: " + clothing.getProductSku());
        if (day == 2) {
            System.out.println("There is a discount today!");
            System.out.printf("You saved: $%,.2f", clothing.calculateDiscount());
            System.out.printf("\nTotal price: $%,.2f", (clothing.getPrice() - clothing.calculateDiscount()));
        } else {
            System.out.println("There is no discount today. Original Price: " + clothing.getPrice());
        }

        // Gardening Department. Has 50% Discount on Tuesdays.
        gardening.setProductName("Small Yellow Rose Bouquet");
        gardening.setProductSku("5120");
        gardening.setPrice(10.99);
        System.out.println("\n\nProduct: " + gardening.getProductName() + "   Product SKU: " + gardening.getProductSku());
        if (day == 2) {
            System.out.println("There is a discount today!");
            System.out.printf("You saved: $%,.2f", gardening.calculateDiscount());
            System.out.printf("\nTotal price: $%,.2f", (gardening.getPrice() - gardening.calculateDiscount()));
        } else {
            System.out.println("There is no discount today. Original Price: " + gardening.getPrice());
        }
    }
}