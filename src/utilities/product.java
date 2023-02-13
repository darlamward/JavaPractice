package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class product {
    private String productName;
    private String productSku;
    private Department productDepartment;
    private double price;
    private int dateOf;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public Department getProductDepartment() {
        return productDepartment;
    }

    public void setProductDepartment(Department productDepartment) {
        this.productDepartment = productDepartment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}