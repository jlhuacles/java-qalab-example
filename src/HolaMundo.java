import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolaMundo {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy");

        LocalDate today = LocalDate.now();
        /*int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear(); */


        String dateString = today.format(formatter);


        System.out.println("Holaa Mundo, hoy es " + dateString);
    }
}
