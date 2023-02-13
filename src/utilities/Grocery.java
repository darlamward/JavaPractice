package utilities;

public class Grocery extends product implements CalculateDiscount{

    @Override
    public double calculateDiscount() {
        return (getPrice() * .1);
    }

}
