import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolaMundo {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy");

        LocalDate today = LocalDate.now();
        /*int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear(); */

        MainResta nuevaResta = new MainResta(2,1);

        String dateString = today.format(formatter);


        System.out.println("Holaa Mundo, hoy es " + dateString);
        System.out.println("Estoy editando desde Github en la web");
        System.out.println("Hola esta es la resta de hoy: " + nuevaResta.restar());
    }
}
