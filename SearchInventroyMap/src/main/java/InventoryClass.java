import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



    public class InventoryClass {

        public static void main(String[] args) {
            String filePath = "C:/Users/Student/IdeaProjects/Class-personal-Projects/Class-personal-Projects/inventory.csv";
            HashMap<Integer, Products> inventory = getInventory(filePath);
            Scanner scan = new Scanner(System.in);

            boolean keepRunning = true;

            while (keepRunning) {
                System.out.println("Enter Product Id: (or enter -1 to exit)");

                int id = scan.nextInt(); // Assuming 'scan' is a Scanner object

                if (id == -1) {
                    keepRunning = false;
                } else if (inventory.containsKey(id)) {
                    Products product = inventory.get(id);
                    System.out.println("Product found: " + product);
                } else {
                    System.out.println("Invalid Option. Please try Again");
                }


                public static HashMap<Integer, Products> getInventory (String filePath){
                    HashMap<Integer, Products> inventory = new HashMap<>();
                    int id = 0;
                    String name = null;
                    double price = 0;
                    try {
                        FileReader reader = new FileReader(filePath);
                        BufferedReader reader1 = new BufferedReader(reader);
                        String lineOfText;

                        while ((lineOfText = reader1.readLine()) != null) {
                            System.out.println("Line of Text: " + lineOfText); //Take line of text break it apart by commas and store that information
                            //into a new product object and then store that new product into inventory hashmap
                            String[] parts = lineOfText.split(",");

                            if (parts.length == 4) {
                                id = Integer.parseInt(parts[0].trim());
                            }
                            name = parts[1].trim();
                            price = Double.parseDouble(parts[2]);


                        }

                    } catch (IOException e) {
                        System.out.println("Error reading file....");
                        throw new RuntimeException(e);
                    }

                    Products product = new Products(id, name, price);
                    inventory.put(id, product);

                    return inventory;
                }

            }
        }
    }