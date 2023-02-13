package utilities;

public class Gardening extends product implements CalculateDiscount{
    @Override
    public double calculateDiscount() {
        return (getPrice() * .5);
    }

}
