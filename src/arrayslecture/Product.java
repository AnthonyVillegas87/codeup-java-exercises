package arrayslecture;

public class Product {
// private instance
    private String name;
// getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//private instance
    private double priceInCents;

    // getters and setters
    public double getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }

    public Product(String name, double priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }



    // array



    //  static method to calculate the average
     public static double getAveragePrice(Product[] products) {
         double total = 0;
        for(Product product : products) {
            total += product.getPriceInCents();

        }
        return total / products.length;

     }



    public static void main(String[] args) {
        Product[] products = {
                new Product("Gum", .99),
                new Product("Toothpaste", 2.99),
                new Product("Shampoo", 3.99)
        };
   double x = Product.getAveragePrice(products);
        System.out.println(x);
    }

}
