import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            String name = JOptionPane.showInputDialog("Hello, what is your name?");
            String ageInput = JOptionPane.showInputDialog("Hello " + name + "! How old are you?");
            int age = Integer.parseInt(ageInput);

            JOptionPane.showMessageDialog(null, "Nice! You are " + age + " years old, " + name + "!");
            JOptionPane.showMessageDialog(null, "Thank you for using the GUI!");

        } catch (Exception e) {
            System.out.println("Sorry, an error occurred!");
            e.printStackTrace(); // Optional: For debugging
        }


            String[] quotes = new String[10];

            quotes[0] = " - The only way to do great work is to love what you do.– Steve Jobs";
            quotes[1] = " - Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchil";
            quotes[2] = " - It is never too late to be what you might have been. – George Eliot";
            quotes[3] = " - You miss 100% of the shots you don’t take. – Wayne Gretzky";
            quotes[4] = " - In the end, we only regret the chances we didn’t take. – Lewis Carroll";
            quotes[5] = " - Melchi 'K Melly' Komi once said, 'When you walk with confidence, the world moves out of your way.";
            quotes[6] = " - Believe you can and you're halfway there. – Theodore Roosevelt";
            quotes[7] = " - Life is what happens when you're busy making other plans. – John Lennon";
            quotes[8] = " - Do not go where the path may lead, go instead where there is no path and leave a trail. – Ralph Waldo Emerson";
            quotes[9] = " - The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt";

            boolean nameNotConfirmed = true;
            String firstName = "";


            System.out.println("Welcome to My Random Quote Generator".trim().toUpperCase());

            boolean firstNameConfirmed = false;
            while (nameNotConfirmed) {
                System.out.println("Enter First Name: ");
                firstName = scan.nextLine();

                System.out.println("You Entered: " + firstName + ". Is this Correct? (Yes) or (No)");
                String confirmation = scan.nextLine();

                if (confirmation.equalsIgnoreCase("Yes")) {
                    System.out.println("First Name Confirmed");
                    firstNameConfirmed = true;
                } else if (confirmation.equalsIgnoreCase("No")) {
                    System.out.println("First Name Not Confirmed. Please Try Again!");
                    continue;
                } else {
                    System.out.println("Invalid Input. Please Try Checking!");
                }
                System.out.println("\n-----------------------------------------------");


                boolean lastNameConfirmed = false;
                String inputlastName = "";

                while (!lastNameConfirmed) {
                    System.out.print("Enter Last Name :");
                    inputlastName = scan.nextLine();
                    System.out.println("\n-------------");

                    System.out.println("Confirm Last Name: Is this Correct? (Yes) or (No) ");
                    confirmation = scan.nextLine().trim();

                    String lastName1 = "";
                    if (confirmation.equalsIgnoreCase("Yes")) {
                        System.out.println("Last Names Match!");
                        lastNameConfirmed = true;
                    } else if (confirmation.equalsIgnoreCase("No")) {
                        System.out.println("Last names Do Not Match...Please Try Again!");
                        continue;
                    } else {
                        System.out.println("Invalid Input. Please Try Again!");


                    }

                }


                boolean keepLooping = false;
                while (!keepLooping) {
                    System.out.println("- Quote Generator List -");
                    System.out.println("\n1.- Get a Motivational Quote - ");
                    System.out.println("\n2.- Get a Inspirational Quote - ");
                    System.out.println("\n3. - Get a Random Quote - ");
                    System.out.println("\n4   . - Exit -");
                    System.out.println("\n- Please Choose an Option");


                    System.out.println("\"Enter a number 1-9 to get the quote of the week: ");
                    ;

                    boolean userChoice = false;


                    int choice = 0;
                    scan.nextLine();


                    while (!userChoice) {

                    }
                    switch (choice) {

                        case 1:
                            System.out.println("Get a Random Quote" + quotes[1]);
                            userChoice = true;
                            break;
                        case 2:
                            System.out.println("Get a Random Quote" + quotes[2]);
                            userChoice = true;
                            break;
                        case 3:
                            System.out.println("Get a Random Quote" + quotes[3]);
                            userChoice = true;
                            break;
                        case 4:
                            System.out.println("Get a Random Quote" + quotes[4]);
                            userChoice = true;
                            break;
                        case 7:
                            Random rand = new Random();
                            int randomIndex = rand.nextInt(quotes.length);
                            System.out.println("Get a Random Quote" + quotes[randomIndex]);
                            keepLooping = false;
                            break;
                        default:
                            System.out.println("Invalid Input. Stay Within 1-10.");
                    }


                }


            }
        }
    }











