package SomeProblem;

import java.math.BigDecimal;

class product{
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal tax;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal inceaseTax(BigDecimal tax){
        int b1 = getTax().intValue();
        b1 += 10;
        BigDecimal b2 = new BigDecimal(b1);
        return BigDecimal.valueOf(b2.doubleValue());
    }

    public void setFiscaDetails(double... values){
        switch (values.length){
            case 3:
                setTax(BigDecimal.valueOf(values[2]));
            case 2:
                setDiscount(BigDecimal.valueOf(values[1]));
            case 1:
                setPrice(BigDecimal.valueOf(values[0]));
        }
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        product p1 = new product();
        p1.setFiscaDetails(1.9, 0.9, 1.0);
        System.out.println(p1.getDiscount());
        System.out.println(p1.inceaseTax(p1.getTax()));
    }
}
