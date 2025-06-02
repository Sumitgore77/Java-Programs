import java.util.Scanner;

class Customer {
    int id;
    String name;
    String mobile;

    public Customer(int id, String name, String mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }
}

class Product {
    int id;
    String name;
    double price;
    int qty;
    double rate;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.rate = price * qty;
    }
}

class Bill {
    void calBill(Customer c, Product[] products) {
        System.out.println("\n===== Invoice =====");
        System.out.println("Customer ID: " + c.id);
        System.out.println("Customer Name: " + c.name);
        System.out.println("Mobile: " + c.mobile);
        System.out.println("====================");
        System.out.printf("%-5s %-10s %-10s %-5s %-10s\n", "ID", "Name", "Price", "Qty", "Total");

        double grandTotal = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-5d %-10s %-10.2f %-5d %-10.2f\n", 
                products[i].id, products[i].name, products[i].price, products[i].qty, products[i].rate);
            grandTotal += products[i].rate;
        }

        System.out.println("====================");
        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }
}

public class BillingAppNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for multiple customers
        System.out.print("Enter number of customers: ");
        int custCount = sc.nextInt();
        sc.nextLine();  // Consume newline

        Customer[] customers = new Customer[custCount];

        for (int i = 0; i < custCount; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1) + ":");
            System.out.print("Enter Customer ID: ");
            int custId = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.print("Enter Customer Name: ");
            String custName = sc.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            customers[i] = new Customer(custId, custName, mobile);
        }

        // Processing each customer
        Bill bill = new Bill();
        for (int i = 0; i < custCount; i++) {
            System.out.println("\nEnter number of products for " + customers[i].name + ": ");
            int prodCount = sc.nextInt();

            Product[] products = new Product[prodCount];

            for (int j = 0; j < prodCount; j++) {
                System.out.println("\nEnter details for Product " + (j + 1) + ":");
                System.out.print("Enter Product ID: ");
                int prodId = sc.nextInt();
                sc.nextLine();  // Consume newline
                System.out.print("Enter Product Name: ");
                String prodName = sc.nextLine();
                System.out.print("Enter Product Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                products[j] = new Product(prodId, prodName, price, qty);
            }

            bill.calBill(customers[i], products);
        }

        sc.close();
    }
}
