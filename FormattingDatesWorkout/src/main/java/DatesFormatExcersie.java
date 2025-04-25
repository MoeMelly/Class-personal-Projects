import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatesFormatExcersie {
    public static void main(String[] args) {


                LocalDateTime localDateTime = LocalDateTime.now();
                ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));





                DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter format3 = DateTimeFormatter .ofPattern("MMMM d, yyyy");
                DateTimeFormatter format4 = DateTimeFormatter .ofPattern("EEEE, MMM d, yyyy HH: mm");
                DateTimeFormatter challengeFormat = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");


                System.out.println("Format 1: " + localDateTime.format(format1));
                System.out.println("Format 2: " + localDateTime.format(format2));
                System.out.println("Format 3: " + localDateTime.format(format3));
                System.out.println("Format 4: " + localDateTime.format(format4));
                System.out.println("ChallengeFormat: " + gmtTime.format(challengeFormat));

            }
        }



            

