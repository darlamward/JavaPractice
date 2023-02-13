package utilities;

public class Bakery extends product implements CalculateDiscount{
    @Override
    public double calculateDiscount() {
        return (getPrice() * .2);
    }

}
