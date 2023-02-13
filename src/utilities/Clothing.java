package utilities;

public class Clothing extends product implements CalculateDiscount{
    @Override
    public double calculateDiscount() {
        return (getPrice() * .3);
    }

}