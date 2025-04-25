import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.io.*;



public class SearchEngineLogged {
     static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
     static Scanner scan = new Scanner(System.in);


    //Static was better since it was specified to for the method (Class can have access and use thus otherwise I would've needed to create an object.
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        boolean stillSearching = true;

        while (stillSearching) {
            System.out.println("- Melchi's Search Logger -");
            System.out.println("Enter a search Term(Just shut off your computer if you want to leave):");

            String searchTerm = scan.nextLine();

            if (searchTerm.equalsIgnoreCase(("exit"))) {
                System.out.println("Thank you!");
                stillSearching = false;
                break;
            } else if (!searchTerm.isEmpty()){
                System.out.println("search :" + searchTerm);
                System.out.println("Here are your results for: " + searchTerm);
                System.out.println("This user has searched for: " + searchTerm);
            } else {
                System.out.println("Nothing to see here....");
            }


            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong....:(");
                throw new RuntimeException(e);
            }
        }
    }


            public void logAction (String messageLogging ) {
                try {
                    FileWriter writer = (new FileWriter("C:\\Users\\Student\\IdeaProjects\\Class-personal-Projects\\Class-personal-Projects", true));
                    BufferedReader bufferedReader = new BufferedReader(Reader.nullReader());
                    String timestamps = LocalDateTime.now().format(timeFormatter);
                    writer.write(timestamps + " " + messageLogging + "\n");
                } catch (IOException e) {
                    System.out.println("Error While Logging.Sorry:(");
                    throw new RuntimeException(e);
                }
            }
        }













