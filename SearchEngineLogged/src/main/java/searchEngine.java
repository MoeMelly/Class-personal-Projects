import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class searchEngine {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] movieList = new String[5];

        movieList[0] = "Terminator 1";
        movieList[1] = "Matrix";
        movieList[2] = "Resident Evil";
        movieList[3] = "Avengers";
        movieList[4] = "Apollo Creed";

        for (int i = 0; i < movieList.length; i++) {
            System.out.println("Movie #" + (i +1) + movieList[i]);

        }
    }



}

