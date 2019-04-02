import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seasons {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter month (December/January/February/March/April/May/June/Jule/August/September/October/November)");
        String input = br.readLine();

        switch (input.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "jule":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("No this month!");
        }

    }
}


