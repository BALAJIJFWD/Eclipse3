package javaproject;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ {
    // Method to find the product with the highest price
    public static int findHighestPricedProduct(Product[] products) {
        Product maxProduct = products[0];
        for (Product product : products) {
            if (product.price > maxProduct.price) {
                maxProduct = product;
            }
        }
        return maxProduct.pid;
    }

    // Method to calculate the total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, 100.0, 2),
            new Product(2, 200.0, 1),
            new Product(3, 150.0, 3),
            new Product(4, 250.0, 2),
            new Product(5, 300.0, 1)
        };

        System.out.println("PID of highest priced product: " + findHighestPricedProduct(products));
        System.out.println("Total amount spent: " + calculateTotalAmount(products));
    }
}