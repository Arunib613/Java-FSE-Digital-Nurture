import java.util.Scanner;

public class Ecommerce_Search {

    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        System.out.print("Enter Product ID to search: ");
        int targetId = sc.nextInt();

        Product linearResult = linearSearch(products, targetId);

        if (linearResult != null) {
            System.out.println("Linear Search Found: " + linearResult);
        } else {
            System.out.println("Linear Search: Product Not Found");
        }

        Product binaryResult = binarySearch(products, targetId);

        if (binaryResult != null) {
            System.out.println("Binary Search Found: " + binaryResult);
        } else {
            System.out.println("Binary Search: Product Not Found");
        }

        sc.close();
    }
}

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}