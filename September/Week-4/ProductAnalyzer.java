// Name: Kunjan

import java.util.ArrayList;
import java.util.List;

class Product
{
    String name;
    double price;

    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
}

public class ProductAnalyzer
{
    public static void main(String[] args)
    {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Keyboard", 35.99));
        products.add(new Product("Mouse", 19.99));
        products.add(new Product("Monitor", 149.99));
        products.add(new Product("Headphones", 59.99));
        products.add(new Product("USB Cable", 8.99));

        System.out.println("==============================");
        System.out.println("       PRODUCT ANALYZER");
        System.out.println("==============================");

        System.out.println("\nProducts below £60:");

        products.stream()
                .filter(product -> product.price < 60)
                .forEach(product ->
                    System.out.printf(
                        "%s - £%.2f%n",
                        product.name,
                        product.price
                    )
                );

        double averagePrice = products.stream()
                .mapToDouble(product -> product.price)
                .average()
                .orElse(0);

        System.out.printf(
            "\nAverage price: £%.2f%n",
            averagePrice
        );

        Product mostExpensive = products.stream()
                .max((product1, product2) ->
                    Double.compare(
                        product1.price,
                        product2.price
                    )
                )
                .orElse(null);

        if (mostExpensive != null)
        {
            System.out.println(
                "Most expensive: "
                + mostExpensive.name
                + " - £"
                + mostExpensive.price
            );
        }
    }
}