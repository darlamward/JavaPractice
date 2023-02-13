package utilities;

public class Household extends product implements CalculateDiscount{
    @Override
    public double calculateDiscount() {
        return (getPrice() * .15);
    }

}
