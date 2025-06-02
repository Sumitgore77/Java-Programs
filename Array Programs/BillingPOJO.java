/*Q 1.	Write a java to Create class name as Food with using data member fid,fname,fprice,fcategory using do while and switch case.
		   ]create array of object of size 5 ,store the food details in it and perform following operations.
	
	case 1 : Add All Food details.
	case 2 : Display All Food details.
	case 3 : Display food details whose price range between 500 to 1000.
	case 4 : Search Food  details using by id.
	case 5 : Update Food  details using by name. 
	case 6 : Delete Food details using by price.
	case 7 : Purchase Food Items.
	case 8 : Display Bill Details :
					Case 1 :  Bill Without Gst.
					Case 2 :  Bill With Gst.
	case 9 : Display Food Details Start first letter is 'P' and ends with 'A'.
	case 10 : Exit The Code.*/

import java.util.*;

class Food {
    int fid;
    String fname;
    int fprice;
    String fcategory;

    // Constructor
    Food(int fid, String fname, int fprice, String fcategory) {
        this.fid = fid;
        this.fname = fname;
        this.fprice = fprice;
        this.fcategory = fcategory;
    }

    // Display food details
    void display() {
        System.out.println("Food ID: " + fid + ", Name: " + fname + ", Price: " + fprice + ", Category: " + fcategory);
    }
}

public class BillingPOJO {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Food[] foods = new Food[5];
        int choice;

        do {
            System.out.println("-----FOOD APP -----");
            System.out.println("1. Add All Food details.");
            System.out.println("2. Display All Food details.");
            System.out.println("3. Display food details whose price range between 500 to 1000.");
            System.out.println("4. Search Food details by ID.");
            System.out.println("5. Update Food details by name.");
            System.out.println("6. Delete Food details by price.");
            System.out.println("7. Purchase Food Items.");
            System.out.println("8. Display Bill Details:");
            System.out.println("\t1. Bill Without GST.");
            System.out.println("\t2. Bill With GST.");
            System.out.println("9. Display Food Details that start with 'P' and end with 'A'.");
            System.out.println("10. Exit the Code.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addFoodDetails(foods);
                    break;
                case 2:
                    displayAllFoodDetails(foods);
                    break;
                case 3:
                    displayFoodInPriceRange(foods);
                    break;
                case 4:
                    searchFoodById(foods);
                    break;
                case 5:
                    updateFoodByName(foods);
                    break;
                case 6:
                    deleteFoodByPrice(foods);
                    break;
                case 7:
                    purchaseFoodItems(foods);
                    break;
                case 8:
                    displayBillDetails();
                    break;
                case 9:
                    displayFoodStartingWithPandEndingWithA(foods);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);
    }

    // Case 1: Add All Food Details
    static void addFoodDetails(Food[] foods) {
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter Food ID: ");
            int fid = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Food Name: ");
            String fname = sc.nextLine();
            System.out.print("Enter Food Price: ");
            int fprice = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Food Category: ");
            String fcategory = sc.nextLine();
            foods[i] = new Food(fid, fname, fprice, fcategory);
        }
    }

    // Case 2: Display All Food Details
    static void displayAllFoodDetails(Food[] foods) {
        for (Food food : foods) {
            if (food != null) {
                food.display();
            }
        }
    }

    // Case 3: Display Food in Price Range
    static void displayFoodInPriceRange(Food[] foods) {
        for (Food food : foods) {
            if (food != null && food.fprice >= 500 && food.fprice <= 1000) {
                food.display();
            }
        }
    }

    // Case 4: Search Food by ID
    static void searchFoodById(Food[] foods) {
        System.out.print("Enter Food ID to search: ");
        int searchId = sc.nextInt();
        for (Food food : foods) {
            if (food != null && food.fid == searchId) {
                food.display();
                return;
            }
        }
        System.out.println("Food with ID " + searchId + " not found.");
    }

    // Case 5: Update Food by Name
    static void updateFoodByName(Food[] foods) {
        sc.nextLine(); // Consume newline
        System.out.print("Enter Food Name to update: ");
        String searchName = sc.nextLine();
        for (Food food : foods) {
            if (food != null && food.fname.equalsIgnoreCase(searchName)) {
                System.out.print("Enter new Food Price: ");
                food.fprice = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter new Food Category: ");
                food.fcategory = sc.nextLine();
                System.out.println("Food details updated.");
                return;
            }
        }
        System.out.println("Food with Name " + searchName + " not found.");
    }

    // Case 6: Delete Food by Price
    static void deleteFoodByPrice(Food[] foods) {
        System.out.print("Enter Food Price to delete: ");
        int searchPrice = sc.nextInt();
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null && foods[i].fprice == searchPrice) {
                foods[i] = null;
                System.out.println("Food item with price " + searchPrice + " deleted.");
                return;
            }
        }
        System.out.println("No food item found with price " + searchPrice + ".");
    }

    // Case 7: Purchase Food Items
    static void purchaseFoodItems(Food[] foods) {
        System.out.println("Enter Food ID to purchase:");
        int foodId = sc.nextInt();
        for (Food food : foods) {
            if (food != null && food.fid == foodId) {
                System.out.println("Food purchased: " + food.fname);
                return;
            }
        }
        System.out.println("Food item with ID " + foodId + " not found.");
    }

    // Case 8: Display Bill Details
    static void displayBillDetails() {
        System.out.println("1. Bill Without GST");
        System.out.println("2. Bill With GST");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Displaying bill without GST...");
        } else if (choice == 2) {
            System.out.println("Displaying bill with GST...");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Case 9: Display Food starting with 'P' and ending with 'A'
    static void displayFoodStartingWithPandEndingWithA(Food[] foods) {
        for (Food food : foods) {
            if (food != null && food.fname.startsWith("P") && food.fname.endsWith("A")) {
                food.display();
            }
        }
    }
}
