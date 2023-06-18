import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int daysUntilEndOfMonth= LocalDate.now().lengthOfMonth()-LocalDate.now().getDayOfMonth();
        int daysUntilEndOfYear= LocalDate.now().lengthOfYear()-LocalDate.now().getDayOfYear();

        System.out.println(" Days left until the end of the month:" + daysUntilEndOfMonth);
        System.out.println("Days left until the end of years:"+ daysUntilEndOfYear);

        }
    }